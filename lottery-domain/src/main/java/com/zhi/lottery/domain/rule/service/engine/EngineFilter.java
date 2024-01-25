package com.zhi.lottery.domain.rule.service.engine;

import com.zhi.lottery.domain.rule.model.req.DecisionMatterReq;
import com.zhi.lottery.domain.rule.model.res.EngineResult;

/**
 * @description: 规则过滤器引擎
 * @author：zhijianhao
 * @date: 2024/1/25
 */
public interface EngineFilter {
    /**
     * 规则过滤器接口
     *
     * @param matter 规则决策物料
     * @return 规则决策结果
     */
    EngineResult process(final DecisionMatterReq matter);
}
