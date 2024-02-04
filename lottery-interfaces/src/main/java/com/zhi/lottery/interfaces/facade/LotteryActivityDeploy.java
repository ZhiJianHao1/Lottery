package com.zhi.lottery.interfaces.facade;

import com.alibaba.fastjson.JSON;
import com.zhi.lottery.application.process.deploy.IActivityDeployProcess;
import com.zhi.lottery.common.Result;
import com.zhi.lottery.domain.activity.model.aggregates.ActivityInfoLimitPageRich;
import com.zhi.lottery.domain.activity.model.req.ActivityInfoLimitPageReq;
import com.zhi.lottery.domain.activity.model.vo.ActivityVO;
import com.zhi.lottery.interfaces.assembler.IMapping;
import com.zhi.lottery.rpc.deploy.ILotteryActivityDeploy;
import com.zhi.lottery.rpc.deploy.dto.ActivityDTO;
import com.zhi.lottery.rpc.deploy.req.ActivityPageReq;
import com.zhi.lottery.rpc.deploy.res.ActivityRes;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 抽奖活动部署
 * @author：zhijianhao
 * @date: 2024/2/4
 */
@Service
public class LotteryActivityDeploy implements ILotteryActivityDeploy {
    
    private Logger logger = LoggerFactory.getLogger(LotteryActivityDeploy.class);
    
    @Resource
    private IActivityDeployProcess activityDeploy;

    @Resource
    private IMapping<ActivityVO, ActivityDTO> activityMapping;
    
    @Override
    public ActivityRes queryActivityListByPageForErp(ActivityPageReq req) {
        try {
            logger.info("活动部署分页数据查询开始 erpID: {}", req.getErpId());

            // 1. 包装入参
            ActivityInfoLimitPageReq activityInfoLimitPageReq = new ActivityInfoLimitPageReq(req.getPage(), req.getRows());
            activityInfoLimitPageReq.setActivityId(req.getActivityId());
            activityInfoLimitPageReq.setActivityName(req.getActivityName());

            // 2. 查询结果
            ActivityInfoLimitPageRich activityInfoLimitPageRich = activityDeploy.queryActivityInfoLimitPage(activityInfoLimitPageReq);
            Long count = activityInfoLimitPageRich.getCount();
            List<ActivityVO> activityVOList = activityInfoLimitPageRich.getActivityVOList();

            // 3. 转换对象
            List<ActivityDTO> activityDTOList = activityMapping.sourceToTarget(activityVOList);

            // 4. 封装数据
            ActivityRes activityRes = new ActivityRes(Result.buildSuccessResult());
            activityRes.setCount(count);
            activityRes.setActivityDTOList(activityDTOList);

            logger.info("活动部署分页数据查询完成 erpID：{} count：{}", req.getErpId(), count);

            // 5. 返回结果
            return activityRes;

        } catch (Exception e) {
            logger.error("活动部署分页数据查询失败 erpID：{} reqStr：{}", req.getErpId(), JSON.toJSON(req), e);
            return new ActivityRes(Result.buildErrorResult());
        }
    }
}
