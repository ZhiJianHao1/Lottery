package com.zhi.lottery.domain.award.service.factory;

import com.zhi.lottery.common.Constants;
import com.zhi.lottery.domain.award.service.goods.IDistributionGoods;
import com.zhi.lottery.domain.award.service.goods.impl.CouponGoods;
import com.zhi.lottery.domain.award.service.goods.impl.DescGoods;
import com.zhi.lottery.domain.award.service.goods.impl.PhysicalGoods;
import com.zhi.lottery.domain.award.service.goods.impl.RedeemCodeGoods;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 各类发奖奖品配置类
 * @author：zhijianhao
 * @date: 2024/1/17
 */
public class GoodsConfig {
    protected static Map<Integer, IDistributionGoods> goodsMap = new ConcurrentHashMap<>();

    @Resource
    private CouponGoods couponGoods;

    @Resource
    private DescGoods descGoods;

    @Resource
    private PhysicalGoods physicalGoods;

    @Resource
    private RedeemCodeGoods redeemCodeGoods;

    @PostConstruct
    public void init() {
        goodsMap.put(Constants.AwardType.DESC.getCode(), descGoods);
        goodsMap.put(Constants.AwardType.RedeemCodeGoods.getCode(), redeemCodeGoods);
        goodsMap.put(Constants.AwardType.CouponGoods.getCode(), couponGoods);
        goodsMap.put(Constants.AwardType.PhysicalGoods.getCode(), physicalGoods);
    }
}
