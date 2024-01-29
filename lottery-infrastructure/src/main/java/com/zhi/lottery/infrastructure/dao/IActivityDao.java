package com.zhi.lottery.infrastructure.dao;

import com.zhi.lottery.domain.activity.model.vo.AlterStateVO;
import com.zhi.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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

    /**
     * 扣减活动库存
     * @param activityId 活动ID
     * @return 更新数量
     */
    int subtractionActivityStock(Long activityId);

    /**
     * 扫描待处理的活动列表，状态为：通过、活动中
     *
     * @param id ID
     * @return 待处理的活动集合
     */
    List<Activity> scanToDoActivityList(Long id);
}
