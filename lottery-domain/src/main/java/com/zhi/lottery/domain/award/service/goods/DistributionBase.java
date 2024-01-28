package com.zhi.lottery.domain.award.service.goods;

import com.zhi.lottery.domain.award.repository.IOrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * @description: 配送货物基础共用类
 * @author：zhijianhao
 * @date: 2024/1/17
 */
public class DistributionBase {
    protected Logger logger = LoggerFactory.getLogger(DistributionBase.class);

    @Resource
    private IOrderRepository awardRepository;

    protected void updateUserAwardState(String uId, Long orderId, String awardId, Integer grantState) {
        awardRepository.updateUserAwardState(uId, orderId, awardId, grantState);
    }
}
