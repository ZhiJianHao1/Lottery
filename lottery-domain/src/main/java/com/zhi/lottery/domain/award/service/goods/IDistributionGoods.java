package com.zhi.lottery.domain.award.service.goods;

import com.zhi.lottery.domain.award.model.req.GoodsReq;
import com.zhi.lottery.domain.award.model.res.DistributionRes;

/**
 * @description: 抽奖，抽象出配送货物接口，把各类奖品模拟成货物、配送代表着发货，包括虚拟奖品和实物奖品
 * @author：zhijianhao
 * @date: 2024/1/17
 */
public interface IDistributionGoods {
    /**
     * 奖品配送接口，奖品类型（1:文字描述 2:兑换码 3:优惠券 4:实物奖品）
     * @param req
     * @return
     */
    DistributionRes doDistribution(GoodsReq req);

    Integer getDistributionGoodsName();
}
