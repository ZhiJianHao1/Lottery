package com.zhi.lottery.domain.strategy.repository;

import com.zhi.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.zhi.lottery.domain.strategy.model.vo.AwardBriefVO;

import java.util.List;

/**
 * @author zhijianhao
 */
public interface IStrategyRepository {
    StrategyRich queryStrategyRich(Long strategyId);

    AwardBriefVO queryAwardInfo(String awardId);

    List<String> queryNoStockStrategyAwardList(Long strategyId);

    boolean deductStock(Long strategyId, String awardId);
}
