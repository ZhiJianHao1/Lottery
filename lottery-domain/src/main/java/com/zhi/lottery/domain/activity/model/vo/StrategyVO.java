package com.zhi.lottery.domain.activity.model.vo;

import java.util.Date;
import java.util.List;

/**
 * @description: 策略信息配置
 * @author：zhijianhao
 * @date: 2024/1/18
 */
public class StrategyVO {
    // 策略Id
    private Long strategyId;
    // 策略描述
    private String strategyDesc;
    // 策略方式
    private Integer strategyMode;
    // 发奖方式
    private Integer grantType;
    // 发奖时间
    private Date grantDate;
    // 扩展信息
    private String extInfo;
    // 策略详情配置信息
    private List<StrategyDetailVO> strategyDetailVOList;

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public String getStrategyDesc() {
        return strategyDesc;
    }

    public void setStrategyDesc(String strategyDesc) {
        this.strategyDesc = strategyDesc;
    }

    public Integer getStrategyMode() {
        return strategyMode;
    }

    public void setStrategyMode(Integer strategyMode) {
        this.strategyMode = strategyMode;
    }

    public Integer getGrantType() {
        return grantType;
    }

    public void setGrantType(Integer grantType) {
        this.grantType = grantType;
    }

    public Date getGrantDate() {
        return grantDate;
    }

    public void setGrantDate(Date grantDate) {
        this.grantDate = grantDate;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public List<StrategyDetailVO> getStrategyDetailVOList() {
        return strategyDetailVOList;
    }

    public void setStrategyDetailVOList(List<StrategyDetailVO> strategyDetailVOList) {
        this.strategyDetailVOList = strategyDetailVOList;
    }

    @Override
    public String toString() {
        return "StrategyVO{" +
                "strategyId=" + strategyId +
                ", strategyDesc='" + strategyDesc + '\'' +
                ", strategyMode=" + strategyMode +
                ", grantType=" + grantType +
                ", grantDate=" + grantDate +
                ", extInfo='" + extInfo + '\'' +
                ", strategyDetailVOList=" + strategyDetailVOList +
                '}';
    }
}
