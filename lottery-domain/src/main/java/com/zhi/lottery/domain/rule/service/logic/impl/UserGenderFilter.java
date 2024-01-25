package com.zhi.lottery.domain.rule.service.logic.impl;

import com.zhi.lottery.domain.rule.model.req.DecisionMatterReq;
import com.zhi.lottery.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * @description: 性别规则
 * @author：zhijianhao
 * @date: 2024/1/25
 */
@Component
public class UserGenderFilter extends BaseLogic {
    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("gender").toString();
    }
}
