package com.zhi.lottery.domain.strategy.repository;

import com.zhi.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.zhi.lottery.infrastructure.po.Award;

import java.util.List;

/**
 * @author zhijianhao
 */
public interface IStrategyRepository {
    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);

    List<String> queryNoStockStrategyAwardList(Long strategyId);

    boolean deductStock(Long strategyId, String awardId);
}
