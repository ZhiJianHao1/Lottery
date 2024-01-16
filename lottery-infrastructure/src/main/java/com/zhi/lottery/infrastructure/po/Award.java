package com.zhi.lottery.infrastructure.po;

import java.util.Date;

/**
 * @author zhijianhao
 * 奖品配置
 */
public class Award {
    // 自增Id
    private Long id;
    // 奖品Id
    private String awardId;
    // 奖品类型（文字描述、兑换码、优惠券、实物奖品）
    private Integer awardType;
    // 奖品数量
    private Integer awardCount;
    // 奖品名称
    private String awardName;
    // 奖品内容（文字描述、key、码）
    private String awardContext;
    // 创建时间
    private Date createTime;
    // 修改时间
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Integer getAwardCount() {
        return awardCount;
    }

    public void setAwardCount(Integer awardCount) {
        this.awardCount = awardCount;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getAwardContext() {
        return awardContext;
    }

    public void setAwardContext(String awardContext) {
        this.awardContext = awardContext;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}