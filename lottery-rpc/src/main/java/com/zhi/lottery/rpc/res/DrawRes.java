package com.zhi.lottery.rpc.res;

import com.zhi.lottery.common.Result;
import com.zhi.lottery.rpc.dto.AwardDTO;

import java.io.Serializable;

/**
 * @description: 抽奖结果
 * @author：zhijianhao
 * @date: 2024/1/26
 */
public class DrawRes extends Result implements Serializable {
    private AwardDTO awardDTO;

    public DrawRes(String code, String info) {
        super(code, info);
    }

    public AwardDTO getAwardDTO() {
        return awardDTO;
    }

    public void setAwardDTO(AwardDTO awardDTO) {
        this.awardDTO = awardDTO;
    }
}
