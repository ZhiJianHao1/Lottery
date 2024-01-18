package com.zhi.lottery.domain.activity.service.deploy.impl;

import com.alibaba.fastjson.JSON;
import com.zhi.lottery.domain.activity.model.aggregates.ActivityConfigRich;
import com.zhi.lottery.domain.activity.model.req.ActivityConfigReq;
import com.zhi.lottery.domain.activity.model.vo.ActivityVO;
import com.zhi.lottery.domain.activity.model.vo.AwardVO;
import com.zhi.lottery.domain.activity.model.vo.StrategyDetailVO;
import com.zhi.lottery.domain.activity.model.vo.StrategyVO;
import com.zhi.lottery.domain.activity.repository.IActivityRepository;
import com.zhi.lottery.domain.activity.service.deploy.IActivityDeploy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yaml.snakeyaml.constructor.DuplicateKeyException;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 部署活动配置服务
 * @author：zhijianhao
 * @date: 2024/1/18
 */
@Service
public class ActivityDeployImpl implements IActivityDeploy {

    private Logger logger = LoggerFactory.getLogger(ActivityDeployImpl.class);

    @Resource
    private IActivityRepository activityRepository;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void createActivity(ActivityConfigReq req) {
        logger.info("创建活动配置开始, activityId: {}", req.getActivityId());
        ActivityConfigRich activityConfigRich= req.getActivityConfigRich();
        try {
            // 添加活动配置
            ActivityVO activity = activityConfigRich.getActivity();
            activityRepository.addActivity(activity);
            
            // 添加奖品配置
            List<AwardVO> awardVOList = activityConfigRich.getAwardVOList();
            activityRepository.addAward(awardVOList);
            
            // 添加策略配置
            StrategyVO strategy = activityConfigRich.getStrategy();
            activityRepository.addStrategy(strategy);
            
            // 添加策略明细配置
            List<StrategyDetailVO> strategyDetailVOList = activityConfigRich.getStrategy().getStrategyDetailVOList();
            activityRepository.addStrategyDetailList(strategyDetailVOList);

            logger.info("创建活动配置完成，activityId：{}", req.getActivityId());
        } catch (DuplicateKeyException e) {
            logger.error("创建活动配置失败，唯一索引冲突 activityId：{} reqJson：{}", req.getActivityId(), JSON.toJSONString(req), e);
            throw e;
        }
    }

    @Override
    public void updateActivity(ActivityConfigReq req) {
        // TODO 核心功能后续补充
    }
}
