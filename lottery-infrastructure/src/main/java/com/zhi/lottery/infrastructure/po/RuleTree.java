package com.zhi.lottery.infrastructure.po;

import java.util.Date;

/**
 * @description: 规则树
 * @author：zhijianhao
 * @date: 2024/1/24
 */
public class RuleTree {
    /**
     * 主键ID
     */
    private Long id;
    /**
     * 规则描述
     */
    private String treeName;
    /**
     * 规则树根Id
     */
    private String treeDesc;
    /**
     * 规则树根Id
     */
    private Long treeRootNodeId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public String getTreeDesc() {
        return treeDesc;
    }

    public void setTreeDesc(String treeDesc) {
        this.treeDesc = treeDesc;
    }

    public Long getTreeRootNodeId() {
        return treeRootNodeId;
    }

    public void setTreeRootNodeId(Long treeRootNodeId) {
        this.treeRootNodeId = treeRootNodeId;
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
