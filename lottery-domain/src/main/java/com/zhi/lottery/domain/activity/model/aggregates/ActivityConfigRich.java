package com.zhi.lottery.domain.activity.model.aggregates;

import com.zhi.lottery.domain.activity.model.vo.ActivityVO;
import com.zhi.lottery.domain.activity.model.vo.AwardVO;
import com.zhi.lottery.domain.activity.model.vo.StrategyVO;

import java.util.List;

/**
 * @description: 活动配置聚合信息
 * @author：zhijianhao
 * @date: 2024/1/18
 */
public class ActivityConfigRich {
    private ActivityVO activity;
    // 策略配置
    private StrategyVO strategy;
    // 奖品配置
    private List<AwardVO> awardVOList;

    public ActivityConfigRich() {
    }

    public ActivityConfigRich(ActivityVO activity, StrategyVO strategy, List<AwardVO> awardVOList) {
        this.activity = activity;
        this.strategy = strategy;
        this.awardVOList = awardVOList;
    }

    public ActivityVO getActivity() {
        return activity;
    }

    public void setActivity(ActivityVO activity) {
        this.activity = activity;
    }

    public StrategyVO getStrategy() {
        return strategy;
    }

    public void setStrategy(StrategyVO strategy) {
        this.strategy = strategy;
    }

    public List<AwardVO> getAwardVOList() {
        return awardVOList;
    }

    public void setAwardVOList(List<AwardVO> awardVOList) {
        this.awardVOList = awardVOList;
    }
}
