package com.zhi.lottery.infrastructure.dao;

import com.zhi.lottery.domain.activity.model.vo.AlterStateVO;
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
    Activity queryActivityById(Long activityId);

    /**
     * 变更活动状态
     * @param alterStateVO [activityId、beforeState、afterState]
     * @return 更新数量
     */
    int alterState(AlterStateVO alterStateVO);
}
