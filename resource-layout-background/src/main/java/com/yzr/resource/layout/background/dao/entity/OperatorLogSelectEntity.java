package com.yzr.resource.layout.background.dao.entity;

import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

/**
 * 后台操作日志查询实体
 */
@Alias("OperatorLogSelectEntity")
public class OperatorLogSelectEntity {
    /**
     * 日志起始id
     */
    private Long beginLogId;
    /**
     * 操作人id
     */
    private String operatorId;
    /**
     * 操作人账号
     */
    private String operatorAccount;
    /**
     * 操作类型
     */
    private Integer logType;
    /**
     * 查询起始时间
     */
    private LocalDateTime beginTime;
    /**
     * 查询结束时间
     */
    private LocalDateTime endTime;
    /**
     * 查询数量
     */
    private Integer count;

    public Long getBeginLogId() {
        return beginLogId;
    }

    public void setBeginLogId(Long beginLogId) {
        this.beginLogId = beginLogId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
