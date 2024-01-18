package com.zhi.lottery.domain.activity.model.vo;

/**
 * @description: 奖品信息配置
 * @author：zhijianhao
 * @date: 2024/1/18
 */
public class AwardVO {
    // 奖品Id
    private String awardId;
    // 奖品类型（1:文字描述 2：兑换码 3:优惠券 4:事务奖品）
    private Integer awardType;
    // 奖品名称
    private String awardName;
    // 奖品内容【描述、奖品码、sku】
    private String awardContent;

    public String getAwardId() {
        return awardId;
    }

    public void setAwardId(String awardId) {
        this.awardId = awardId;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getAwardContent() {
        return awardContent;
    }

    public void setAwardContent(String awardContent) {
        this.awardContent = awardContent;
    }

    @Override
    public String toString() {
        return "AwardVO{" +
                "awardId='" + awardId + '\'' +
                ", awardState=" + awardType +
                ", awardName='" + awardName + '\'' +
                ", awardContent='" + awardContent + '\'' +
                '}';
    }
}
