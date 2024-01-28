package com.zhi.lottery.domain.award.service.goods.impl;

import com.zhi.lottery.common.Constants;
import com.zhi.lottery.domain.award.model.req.GoodsReq;
import com.zhi.lottery.domain.award.model.res.DistributionRes;
import com.zhi.lottery.domain.award.service.goods.DistributionBase;
import com.zhi.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;

/**
 * @description: 描述类商品，以文字形式展示给用户
 * @author：zhijianhao
 * @date: 2024/1/17
 */
@Component
public class DescGoods extends DistributionBase implements IDistributionGoods {
    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.GrantState.COMPLETE.getCode());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }
}
