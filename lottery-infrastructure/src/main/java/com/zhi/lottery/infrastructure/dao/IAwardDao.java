package com.zhi.lottery.infrastructure.dao;

import com.zhi.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhijianhao
 */
@Mapper
public interface IAwardDao {
    /**
     * 查询奖品信息
     * @param awardId 奖品Id
     * @return 奖品信息
     */
    Award queryAwardInfo(String awardId);

    /**
     * 插入奖品配置
     * @param awards 奖品配置
     */
    void insertList(@Param("list") List<Award> awards);
}
