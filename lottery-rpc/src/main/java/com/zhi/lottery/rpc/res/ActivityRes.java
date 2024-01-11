package com.zhi.lottery.rpc.res;

import com.zhi.lottery.common.Result;
import com.zhi.lottery.rpc.dto.ActivityDto;

import java.io.Serializable;

/**
 * @author zhijianhao
 */
public class ActivityRes implements Serializable {

    private Result result;

    private ActivityDto activityDto;

    public ActivityRes(Result result) {
        this.result =result;
    }

    public ActivityRes(Result result, ActivityDto activity) {
        this.result = result;
        this.activityDto = activity;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public ActivityDto getActivityDto() {
        return activityDto;
    }

    public void setActivityDto(ActivityDto activityDto) {
        this.activityDto = activityDto;
    }
}
