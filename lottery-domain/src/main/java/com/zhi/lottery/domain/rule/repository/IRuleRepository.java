package com.zhi.lottery.domain.rule.repository;

import com.zhi.lottery.domain.rule.model.aggregates.TreeRuleRich;

/**
 * @description: 规则信息仓储服务接口
 * @author：zhijianhao
 * @date: 2024/1/24
 */
public interface IRuleRepository {
    /**
     * 查询规则决策树配置
     *
     * @param treeId    决策树ID
     * @return          决策树配置
     */
    TreeRuleRich queryTreeRuleRich(Long treeId);
}
