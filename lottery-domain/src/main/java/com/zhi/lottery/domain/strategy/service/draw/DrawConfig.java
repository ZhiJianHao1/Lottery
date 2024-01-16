package com.zhi.lottery.domain.strategy.service.draw;

import com.zhi.lottery.common.Constants;
import com.zhi.lottery.domain.strategy.service.algorithm.IDrawAlgorithm;
import com.zhi.lottery.domain.strategy.service.algorithm.impl.EntiretyRateRandomDrawAlgorithm;
import com.zhi.lottery.domain.strategy.service.algorithm.impl.SingleRateRandomDrawAlgorithm;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhijianhao
 */
public class DrawConfig {

    @Resource
    private EntiretyRateRandomDrawAlgorithm defaultRateRandomDrawAlgorithm;
    @Resource
    private SingleRateRandomDrawAlgorithm singleRateRandomDrawAlgorithm;

    protected static Map<Integer, IDrawAlgorithm> drawAlgorithmGroup = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        drawAlgorithmGroup.put(Constants.StrategyMode.SINGLE.getCode(), defaultRateRandomDrawAlgorithm);
        drawAlgorithmGroup.put(Constants.StrategyMode.ENTIRETY.getCode(), singleRateRandomDrawAlgorithm);
    }
}
