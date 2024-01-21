package com.zhi.lottery.domain.activity.repository;

import java.util.Date;

/**
 * @description: 用户参与活动仓储接口
 * @author：zhijianhao
 * @date: 2024/1/19
 */
public interface IUserTakeActivityRepository {
    void takeActivity(Long activityId, String activityName, Integer takeCount, Integer userTakeLeftCount, String s, Date partakeDate, Long takeId);

    int subtractionLeftCount(Long activityId, String activityName, Integer takeCount, Integer userTakeLeftCount, String s, Date partakeDate);
}
