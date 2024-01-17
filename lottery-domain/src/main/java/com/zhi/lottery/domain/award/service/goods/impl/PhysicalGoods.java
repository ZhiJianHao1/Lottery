package com.zhi.lottery.domain.award.service.goods.impl;

import com.zhi.lottery.common.Constants;
import com.zhi.lottery.domain.award.model.req.GoodsReq;
import com.zhi.lottery.domain.award.model.res.DistributionRes;
import com.zhi.lottery.domain.award.service.goods.DistributionBase;
import com.zhi.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;

/**
 * @description: 实物发货类商品
 * @author：zhijianhao
 * @date: 2024/1/17
 */
@Component
public class PhysicalGoods extends DistributionBase implements IDistributionGoods {
    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        logger.info("模拟调用实物发奖 uId：{} awardCount: {}", req.getuId(), req.getAwardContent());

        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

    @Override
    public Integer getDistributionGoodsName() {
        return Constants.AwardType.PhysicalGoods.getCode();
    }
}
