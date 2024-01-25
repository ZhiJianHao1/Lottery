package com.zhi.lottery.domain.rule.service.logic.impl;

import com.zhi.lottery.domain.rule.model.req.DecisionMatterReq;
import com.zhi.lottery.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * @description: 年龄规则
 * @author：zhijianhao
 * @date: 2024/1/25
 */
@Component
public class UserAgeFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("age").toString();
    }
}
