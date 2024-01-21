package com.zhi.lottery.domain.activity.service.partake;

import com.zhi.lottery.domain.activity.model.req.PartakeReq;
import com.zhi.lottery.domain.activity.model.vo.ActivityBillVO;
import com.zhi.lottery.domain.activity.repository.IActivityRepository;

import javax.annotation.Resource;

/**
 * @description: 活动领取模操作，一些通用的数据服务
 * @author：zhijianhao
 * @date: 2024/1/19
 */
public class ActivityPartakeSupport {
    @Resource
    protected IActivityRepository activityRepository;

    protected ActivityBillVO queryActivityBill(PartakeReq req){
        return activityRepository.queryActivityBill(req);
    }
}
