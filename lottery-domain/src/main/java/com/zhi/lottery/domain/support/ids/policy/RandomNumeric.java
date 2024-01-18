package com.zhi.lottery.domain.support.ids.policy;

import com.zhi.lottery.domain.support.ids.IIdGenerator;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

/**
 * @description: 工具类生成 org.apache.commons.lang3.RandomStringUtils
 * @author：zhijianhao
 * @date: 2024/1/18
 */
@Component
public class RandomNumeric implements IIdGenerator {


    @Override
    public long nextId() {
        return  Long.parseLong(RandomStringUtils.randomNumeric(11));
    }
}
