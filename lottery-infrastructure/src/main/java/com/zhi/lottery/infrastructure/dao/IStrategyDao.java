package com.zhi.lottery.infrastructure.dao;

import com.zhi.lottery.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhijianhao
 */
@Mapper
public interface IStrategyDao {
    Strategy queryStrategy(Long strategyId);
}
