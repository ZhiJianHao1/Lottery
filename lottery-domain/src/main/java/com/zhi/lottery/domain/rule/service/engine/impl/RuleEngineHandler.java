package com.zhi.lottery.domain.rule.service.engine.impl;

import com.zhi.lottery.domain.rule.model.aggregates.TreeRuleRich;
import com.zhi.lottery.domain.rule.model.req.DecisionMatterReq;
import com.zhi.lottery.domain.rule.model.res.EngineResult;
import com.zhi.lottery.domain.rule.model.vo.TreeNodeVO;
import com.zhi.lottery.domain.rule.repository.IRuleRepository;
import com.zhi.lottery.domain.rule.service.engine.EngineBase;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 规则引擎处理器
 * @author：zhijianhao
 * @date: 2024/1/25
 */
@Service("ruleEngineHandler")
public class RuleEngineHandler extends EngineBase {
    @Resource
    private IRuleRepository ruleRepository;

    @Override
    public EngineResult process(DecisionMatterReq matter) {
        TreeRuleRich treeRuleRich = ruleRepository.queryTreeRuleRich(matter.getTreeId());
        if (null == treeRuleRich) {
            throw new RuntimeException("Tree Rule is null");
        }
        
        // 决策节点
        TreeNodeVO treeNodeInfo = engineDecisionMaker(treeRuleRich, matter);
        // 决策结果
        return new EngineResult(matter.getUserId(), treeNodeInfo.getTreeId(), treeNodeInfo.getTreeNodeId(), treeNodeInfo.getNodeValue());
    }
}
