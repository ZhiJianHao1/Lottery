package com.zhi.lottery.domain.rule.service.logic;

import com.zhi.lottery.domain.rule.model.req.DecisionMatterReq;
import com.zhi.lottery.domain.rule.model.vo.TreeNodeLineVO;

import java.util.List;

/**
 * @description: 规则过滤器接口
 * @author：zhijianhao
 * @date: 2024/1/25
 */
public interface LogicFilter {
    /**
     * 逻辑决策器
     *
     * @param matterValue           决策点
     * @param treeNodeLineVOList    决策节点
     * @return                      下一个姐节点Id
     */
    Long filter(String matterValue, List<TreeNodeLineVO> treeNodeLineVOList);

    /**
     * 获取决策之
     *
     * @param decisionMatter 决策物料
     * @return               决策之
     */
    String matterValue(DecisionMatterReq decisionMatter);
}
