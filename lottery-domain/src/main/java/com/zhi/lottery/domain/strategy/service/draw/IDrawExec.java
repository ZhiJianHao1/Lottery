package com.zhi.lottery.domain.strategy.service.draw;

import com.zhi.lottery.domain.strategy.model.req.DrawReq;
import com.zhi.lottery.domain.strategy.model.res.DrawResult;

/**
 * @author zhijianhao
 */
public interface IDrawExec {

    DrawResult doDrawExec(DrawReq req);
}
