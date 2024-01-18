package com.zhi.lottery.domain.activity.service.stateflow;

import com.zhi.lottery.common.Constants;
import com.zhi.lottery.common.Result;
import com.zhi.lottery.domain.activity.repository.IActivityRepository;

import javax.annotation.Resource;

/**
 * @description: 活动状态抽象类
 * @author：zhijianhao
 * @date: 2024/1/18
 */
public abstract class AbstractState {

    @Resource
    protected IActivityRepository activityRepository;

    /**
     * 活动提审
     * @param activityId 活动Id
     * @param currentState 当前状态
     * @return 执行结果
     */
    public abstract Result arraignment(Long activityId, Enum<Constants.ActivityState> currentState);

    /**
     * 审核通过
     * @param activityId 活动Id
     * @param currentState 当前状态
     * @return 执行结果
     */
    public abstract Result checkPass(Long activityId, Enum<Constants.ActivityState> currentState);

    /**
     * 审核拒绝
     * @param activityId 活动Id
     * @param currentState 当前状态
     * @return 执行结果
     */
    public abstract Result checkRefuse(Long activityId, Enum<Constants.ActivityState> currentState);

    /**
     * 撤审撤销
     *
     * @param activityId   活动ID
     * @param currentState 当前状态
     * @return 执行结果
     */
    public abstract Result checkRevoke(Long activityId, Enum<Constants.ActivityState> currentState);

    /**
     * 活动关闭
     *
     * @param activityId   活动ID
     * @param currentState 当前状态
     * @return 执行结果
     */
    public abstract Result close(Long activityId, Enum<Constants.ActivityState> currentState);

    /**
     * 活动开启
     *
     * @param activityId   活动ID
     * @param currentState 当前状态
     * @return 执行结果
     */
    public abstract Result open(Long activityId, Enum<Constants.ActivityState> currentState);

    /**
     * 活动执行
     *
     * @param activityId   活动ID
     * @param currentState 当前状态
     * @return 执行结果
     */
    public abstract Result doing(Long activityId, Enum<Constants.ActivityState> currentState);
}
