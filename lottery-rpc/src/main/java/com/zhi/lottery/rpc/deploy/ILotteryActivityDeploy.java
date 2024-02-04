package com.zhi.lottery.rpc.deploy;

import com.zhi.lottery.rpc.deploy.req.ActivityPageReq;
import com.zhi.lottery.rpc.deploy.res.ActivityRes;

/**
 * @description: 抽奖活动部署服务接口
 * @author：zhijianhao
 * @date: 2024/2/4
 */
public interface ILotteryActivityDeploy {
    /**
     * 通过分页查询活动列表信息，给ERP运营使用
     *
     * @param req   查询参数
     * @return      查询结果
     */
    ActivityRes queryActivityListByPageForErp(ActivityPageReq req);
}
