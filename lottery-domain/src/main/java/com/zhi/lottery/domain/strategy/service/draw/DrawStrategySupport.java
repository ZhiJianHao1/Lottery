package com.zhi.lottery.domain.strategy.service.draw;

import com.zhi.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.zhi.lottery.domain.strategy.model.vo.AwardBriefVO;
import com.zhi.lottery.domain.strategy.repository.IStrategyRepository;

import javax.annotation.Resource;

/**
 * @description: 抽奖策略数据支撑，一些通用的数据服务
 * @author：zhijianhao
 * @date: 2024/1/16
 */
public class DrawStrategySupport extends DrawConfig {
    @Resource
    protected IStrategyRepository strategyRepository;

    /**
     * 查询策略配置信息
     * @param strategyId 策略Id
     * @return 策略配置信息
     */
    protected StrategyRich queryStrategyRich(Long strategyId) {
        return strategyRepository.queryStrategyRich(strategyId);
    }

    /**
     * 查询奖品详细信息
     * @param awardId 奖品Id
     * @return 中奖详情
     */
    protected AwardBriefVO queryAwardInfoByAwardId(String awardId) {
        return strategyRepository.queryAwardInfo(awardId);
    }
}
