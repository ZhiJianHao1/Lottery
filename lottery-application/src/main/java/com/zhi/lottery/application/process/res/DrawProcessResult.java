package com.zhi.lottery.application.process.res;

import com.zhi.lottery.common.Result;
import com.zhi.lottery.domain.strategy.model.vo.DrawAwardInfo;

/**
 * @description: 活动抽奖结果
 * @author：zhijianhao
 * @date: 2024/1/24
 */
public class DrawProcessResult extends Result {
    private DrawAwardInfo drawAwardInfo;

    public DrawProcessResult(String code, String info) {
        super(code, info);
    }

    public DrawProcessResult(String code, String info, DrawAwardInfo drawAwardInfo) {
        super(code, info);
        this.drawAwardInfo = drawAwardInfo;
    }

    public DrawAwardInfo getDrawAwardInfo() {
        return drawAwardInfo;
    }

    public void setDrawAwardInfo(DrawAwardInfo drawAwardInfo) {
        this.drawAwardInfo = drawAwardInfo;
    }
}
