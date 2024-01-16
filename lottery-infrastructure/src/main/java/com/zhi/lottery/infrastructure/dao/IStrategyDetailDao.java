package com.zhi.lottery.infrastructure.dao;

import com.zhi.lottery.infrastructure.po.StrategyDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhijianhao
 */
@Mapper
public interface IStrategyDetailDao {
    List<StrategyDetail> queryStrategyDetailList(Long strategyId);

    List<String> queryNoStockStrategyAwardList(Long strategyId);


    int deductStock(@Param("req") StrategyDetail req);
}
