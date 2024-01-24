package com.zhi.lottery.domain.activity.model.res;

import com.zhi.lottery.common.Result;

/**
 * @description: 活动参与结果
 * @author：zhijianhao
 * @date: 2024/1/19
 */
public class PartakeResult extends Result {
    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 领取ID
     */
    private Long takeId;

    public PartakeResult(String code, String info) {
        super(code, info);
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public Long getTakeId() {
        return takeId;
    }

    public void setTakeId(Long takeId) {
        this.takeId = takeId;
    }
}
