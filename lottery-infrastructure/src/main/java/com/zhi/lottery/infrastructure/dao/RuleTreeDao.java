package com.zhi.lottery.infrastructure.dao;

import com.zhi.lottery.infrastructure.po.RuleTree;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description:
 * @author：zhijianhao
 * @date: 2024/1/24
 */
@Mapper
public interface RuleTreeDao {

    /**
     * 规则树查询
     * @param id ID
     * @return   规则树
     */
    RuleTree queryRuleTreeByTreeId(Long id);

    /**
     * 规则树简要信息查询
     * @param treeId 规则树ID
     * @return       规则树
     */
    RuleTree queryTreeSummaryInfo(Long treeId);
}
