package com.zhi.lottery.application.process;

import com.zhi.lottery.application.process.req.DrawProcessReq;
import com.zhi.lottery.application.process.res.DrawProcessResult;

/**
 * @description: 活动抽奖流程编排接口
 * @author：zhijianhao
 * @date: 2024/1/24
 */
public interface IActivityProcess {

    /**
     * 执行抽奖流程
     * @param req 抽奖请求
     * @return    抽奖结果
     */
    DrawProcessResult doDrawProcess(DrawProcessReq req);
}
