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
    /**
     * 查询策略配置详细信息
     * @param strategyId 策略Id
     * @return 策略配置详细信息
     */
    List<StrategyDetail> queryStrategyDetailList(Long strategyId);

    /**
     * 查询无库存策略配置Id
     * @param strategyId 策略Id
     * @return 返回结果
     */
    List<String> queryNoStockStrategyAwardList(Long strategyId);

    /**
     * 扣减库存
     * @param req 策略Id，奖品Id
     * @return 返回结果
     */
    int deductStock(@Param("req") StrategyDetail req);

    /**
     * 插入策略配置组
     * @param strategyDetails 策略配置组
     */
    void insertList(List<StrategyDetail> strategyDetails);
}
