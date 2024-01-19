package com.zhi.lottery.infrastructure.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouter;
import com.zhi.lottery.infrastructure.po.UserTakeActivity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: 用户领取活动表DAO
 * @author：zhijianhao
 * @date: 2024/1/19
 */
@Mapper
public interface IUserTakeActivityDao {

    /**
     * 插入用户领取活动信息
     * @param userTakeActivity 入参
     */
    @DBRouter(key = "uId'")
    void insert(UserTakeActivity userTakeActivity);
}
