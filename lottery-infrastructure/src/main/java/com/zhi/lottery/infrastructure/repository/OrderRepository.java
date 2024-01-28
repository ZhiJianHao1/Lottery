package com.zhi.lottery.infrastructure.repository;

import com.zhi.lottery.domain.award.repository.IOrderRepository;
import com.zhi.lottery.infrastructure.dao.IUserStrategyExportDao;
import com.zhi.lottery.infrastructure.po.UserStrategyExport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @description: 奖品表仓储服务
 * @author：zhijianhao
 * @date: 2024/1/16
 */
@Repository
public class OrderRepository implements IOrderRepository {

    @Resource
    private IUserStrategyExportDao userStrategyExportDao;

    @Override
    public void updateUserAwardState(String uId, Long orderId, String awardId, Integer grantState) {
        UserStrategyExport userStrategyExport = new UserStrategyExport();
        userStrategyExport.setuId(uId);
        userStrategyExport.setOrderId(orderId);
        userStrategyExport.setAwardId(awardId);
        userStrategyExport.setGrantState(grantState);
        userStrategyExportDao.updateUserAwardState(userStrategyExport);
    }
}
