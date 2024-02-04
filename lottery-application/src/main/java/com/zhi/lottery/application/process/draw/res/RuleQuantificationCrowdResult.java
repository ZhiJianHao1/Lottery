package com.zhi.lottery.application.process.draw.res;

import com.zhi.lottery.common.Result;

/**
 * @description:
 * @author：zhijianhao
 * @date: 2024/1/26
 */
public class RuleQuantificationCrowdResult extends Result {
    /** 活动Id */
    private Long activityId;

    public RuleQuantificationCrowdResult(String code, String info) {
        super(code, info);
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}
