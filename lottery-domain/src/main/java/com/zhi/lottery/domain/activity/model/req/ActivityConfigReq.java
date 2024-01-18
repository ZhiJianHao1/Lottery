package com.zhi.lottery.domain.activity.model.req;

import com.zhi.lottery.domain.activity.model.aggregates.ActivityConfigRich;

/**
 * @description: 活动配置请求对象
 * @author：zhijianhao
 * @date: 2024/1/18
 */
public class ActivityConfigReq {
    private Long activityId;

    private ActivityConfigRich activityConfigRich;

    public ActivityConfigReq() {
    }

    public ActivityConfigReq(Long activityId, ActivityConfigRich activityConfigRich) {
        this.activityId = activityId;
        this.activityConfigRich = activityConfigRich;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public ActivityConfigRich getActivityConfigRich() {
        return activityConfigRich;
    }

    public void setActivityConfigRich(ActivityConfigRich activityConfigRich) {
        this.activityConfigRich = activityConfigRich;
    }
}
