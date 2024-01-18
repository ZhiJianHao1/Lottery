package com.zhi.lottery.interfaces;

import com.zhi.lottery.common.Constants;
import com.zhi.lottery.common.Result;
import com.zhi.lottery.infrastructure.dao.IActivityDao;
import com.zhi.lottery.infrastructure.po.Activity;
import com.zhi.lottery.rpc.IActivityBooth;
import com.zhi.lottery.rpc.dto.ActivityDto;
import com.zhi.lottery.rpc.req.ActivityReq;
import com.zhi.lottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * 活动展台
 * @author zhijianhao
 */
@Service
public class ActivityBooth implements IActivityBooth {

    @Resource
    private IActivityDao activityDao;
    @Override
    public ActivityRes queryActivityById(ActivityReq req) {

        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activityDto.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }
}
