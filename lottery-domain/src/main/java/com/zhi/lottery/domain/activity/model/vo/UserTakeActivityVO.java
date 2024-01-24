package com.zhi.lottery.domain.activity.model.vo;

/**
 * @description: 用户领取活动记录
 * @author：zhijianhao
 * @date: 2024/1/24
 */
public class UserTakeActivityVO {
    /**
     * 活动Id
     */
    private Long activityId;
    /**
     * 活动领取Id
     */
    private Long takeId;
    /**
     * 策略Id
     */
    private Long strategyId;
    /**
     * 活动单使用状态 0未使用 1已使用
     * Constants.TaskState
     */
    private Integer state;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getTakeId() {
        return takeId;
    }

    public void setTakeId(Long takeId) {
        this.takeId = takeId;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
