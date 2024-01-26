package com.zhi.lottery.rpc.req;

import java.util.Map;

/**
 * @description: 量化人群抽奖请求参数
 * @author：zhijianhao
 * @date: 2024/1/26
 */
public class QuantificationDrawReq {
    /**
     * 用户ID
     */
    private String uId;
    /**
     * 规则树ID
     */
    private Long treeId;
    /**
     * 决策值
     */
    private Map<String, Object> valMap;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Map<String, Object> getValMap() {
        return valMap;
    }

    public void setValMap(Map<String, Object> valMap) {
        this.valMap = valMap;
    }
}
