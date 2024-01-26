package com.zhi.lottery.domain.strategy.service.algorithm;

import com.zhi.lottery.domain.strategy.model.vo.AwardRateVO;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 共用的算法逻辑
 * @author zhijianhao
 */
public abstract class BaseAlgorithm implements IDrawAlgorithm {

    // 斐波那契散列增量，逻辑：黄金分割点：(√5 - 1) / 2 = 0.6180339887，Math.pow(2, 32) * 0.6180339887 = 0x61c88647
    private final int HASH_INCREMETN = 0x61c88647;
    // 数组初始化长度
    private final int RATE_TUPLE_LENGTH = 128;

    // 存放概率与奖品对应的散列结果，strategyId -> rateTuple
    protected Map<Long, String[]> rateTupleMap = new ConcurrentHashMap<>();
    // 奖品区间概率值，strategyId -> [awardId -> begin、awardId -> end]
    protected Map<Long, List<AwardRateVO>> awardRateInfoMap = new ConcurrentHashMap<>();

    @Override
    public void initRateTuple(Long strategyId, List<AwardRateVO> awardRateInfoList) {
        // 保存奖品概率信息
        awardRateInfoMap.put(strategyId, awardRateInfoList);

        String[] rateTuple = rateTupleMap.computeIfAbsent(strategyId, k -> new String[RATE_TUPLE_LENGTH]);

        int cursorVal = 0;
        for (AwardRateVO awardRateInfo : awardRateInfoList) {
            int rateVal = awardRateInfo.getAwardRate().multiply(new BigDecimal(100)).intValue();

            // 循环填充概率范围值
            for (int i = cursorVal + 1; i <= (rateVal + cursorVal); i++) {
                rateTuple[hasIdx(i)] = awardRateInfo.getAwardId();
            }

            cursorVal += rateVal;
        }
    }

    @Override
    public boolean isExistRateTuple(Long strategyId) {
        return rateTupleMap.containsKey(strategyId);
    }

    /**
     * 斐波那契散列法，计算哈希索引下标
     * @param val 值
     * @return 索引
     */
    protected int hasIdx(int val) {
        int hashCode = val * HASH_INCREMETN + HASH_INCREMETN;
        return hashCode & (RATE_TUPLE_LENGTH - 1);
    }

    protected int generateSecureRandomIntCode(int bound) {
        return new SecureRandom().nextInt(bound) + 1;
    }
}
