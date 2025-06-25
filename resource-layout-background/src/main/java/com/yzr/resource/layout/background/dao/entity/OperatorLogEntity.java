package com.yzr.resource.layout.background.dao.entity;

public class OperatorLogEntity {
    /***
     * 操作人id
     */
    private String operatorId;
    /**
     * 操作人账号
     */
    private String operatorAccount;
    /**
     * 操作类型 1 创建后台账号 2 删除后台账号
     */
    private Integer logType;
    /**
     * 操作参数 json字符串
     */
    private String param;
    /**
     * 操作结果 1 成功 2 失败
     */
    private String result;
}
