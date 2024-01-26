package com.zhi.lottery.rpc;

import com.zhi.lottery.rpc.req.DrawReq;
import com.zhi.lottery.rpc.req.QuantificationDrawReq;
import com.zhi.lottery.rpc.res.DrawRes;

/**
 * @description: 抽奖活动展台接口
 * @author：zhijianhao
 * @date: 2024/1/26
 */
public interface ILotteryActivityBooth {

    /**
     * 指定活动抽奖
     * @param drawReq 请求参数
     * @return        抽奖结果
     */
    DrawRes doDraw(DrawReq drawReq);

    /**
     * 量化人群抽奖
     * @param quantificationDrawReq 请求参数
     * @return                      抽奖结果
     */
    DrawRes doQuantificationDraw(QuantificationDrawReq quantificationDrawReq);
}
