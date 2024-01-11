package com.zhi.lottery.rpc;

import com.zhi.lottery.rpc.req.ActivityReq;
import com.zhi.lottery.rpc.res.ActivityRes;

/**
 * @author zhijianhao
 */
public interface IActivityBooth {

    ActivityRes queryActivityById(ActivityReq req);
}
