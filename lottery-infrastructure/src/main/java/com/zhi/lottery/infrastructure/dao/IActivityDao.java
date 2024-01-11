package com.zhi.lottery.infrastructure.dao;

import com.zhi.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhijianhao
 */
@Mapper
public interface IActivityDao {
    /**
     * 新增活动基础信息
     * @param activity 活动基础信息
     */
    void insert(Activity activity);

    /**
     * 根据活动Id查询
     * @param activityId 活动Id
     * @return Activity
     */
    Activity queryActivityId(Long activityId);

}
