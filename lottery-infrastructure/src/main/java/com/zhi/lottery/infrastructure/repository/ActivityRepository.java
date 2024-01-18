package com.zhi.lottery.infrastructure.repository;

import com.zhi.lottery.common.Constants;
import com.zhi.lottery.domain.activity.model.vo.*;
import com.zhi.lottery.domain.activity.repository.IActivityRepository;
import com.zhi.lottery.infrastructure.dao.IActivityDao;
import com.zhi.lottery.infrastructure.dao.IAwardDao;
import com.zhi.lottery.infrastructure.dao.IStrategyDao;
import com.zhi.lottery.infrastructure.dao.IStrategyDetailDao;
import com.zhi.lottery.infrastructure.po.Activity;
import com.zhi.lottery.infrastructure.po.Award;
import com.zhi.lottery.infrastructure.po.Strategy;
import com.zhi.lottery.infrastructure.po.StrategyDetail;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author：zhijianhao
 * @date: 2024/1/18
 */
@Component
public class ActivityRepository implements IActivityRepository {

    @Resource
    private IActivityDao activityDao;

    @Resource
    private IAwardDao awardDao;

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Override
    public void addActivity(ActivityVO activity) {
        Activity req = new Activity();
        BeanUtils.copyProperties(activity, req);
        activityDao.insert(req);
    }

    @Override
    public void addAward(List<AwardVO> awardList) {
        List<Award> awards = new ArrayList<>();
        for (AwardVO awardVO : awardList) {
            Award award = new Award();
            BeanUtils.copyProperties(awardVO, award);
            awards.add(award);
        }
        awardDao.insertList(awards);
    }

    @Override
    public void addStrategy(StrategyVO strategy) {
        Strategy req = new Strategy();
        BeanUtils.copyProperties(strategy, req);
        strategyDao.insert(req);
    }

    @Override
    public void addStrategyDetailList(List<StrategyDetailVO> strategyDetailList) {
        List<StrategyDetail> strategyDetails = new ArrayList<>();
        for (StrategyDetailVO strategyDetailVO : strategyDetailList) {
            StrategyDetail strategyDetail = new StrategyDetail();
            BeanUtils.copyProperties(strategyDetailVO, strategyDetail);
            strategyDetails.add(strategyDetail);
        }
        strategyDetailDao.insertList(strategyDetails);
    }

    @Override
    public boolean alterStatus(Long activityId, Enum<Constants.ActivityState> beforeState, Enum<Constants.ActivityState> afterState) {
        AlterStateVO alterStateVO = new AlterStateVO(activityId, ((Constants.ActivityState) beforeState).getCode(),  ((Constants.ActivityState) afterState).getCode());
        int count = activityDao.alterState(alterStateVO);
        return count == 1;
    }
}
