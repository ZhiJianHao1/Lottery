package com.zhi.lottery.infrastructure.dao;

import com.zhi.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhijianhao
 */
@Mapper
public interface IAwardDao {
    Award queryAwardInfo(String awardId);
}
