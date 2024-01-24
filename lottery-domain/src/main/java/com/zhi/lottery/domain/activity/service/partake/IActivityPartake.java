package com.zhi.lottery.domain.activity.service.partake;

import com.zhi.lottery.common.Result;
import com.zhi.lottery.domain.activity.model.req.PartakeReq;
import com.zhi.lottery.domain.activity.model.res.PartakeResult;
import com.zhi.lottery.domain.activity.model.vo.DrawOrderVO;

/**
 * @description: 抽奖活动参与接口
 * @author：zhijianhao
 * @date: 2024/1/18
 */
public interface IActivityPartake {

    /**
     * 参与活动
     * @param req 参数
     * @return 领取结果
     */
    PartakeResult doPartake(PartakeReq req);

    /**
     * 保存奖品单
     * @param drawOrder 奖品单
     * @return 保存结果
     */
    Result recordDrawOrder(DrawOrderVO drawOrder);
}
