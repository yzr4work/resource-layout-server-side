package com.yzr.resource.layout.background.dao.entity;

import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Alias("OperatorLogEntity")
public class OperatorLogEntity {
    /**
     * 操作记录id
     */
    private Long logId;
    /***
     * 操作人id
     */
    private String bgUserId;
    /**
     * 操作人账号
     */
    private String BgUserAccount;
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
    private Integer result;
    /**
     * 操作时间
     */
    private LocalDateTime createTime;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public String getBgUserId() {
        return bgUserId;
    }

    public void setBgUserId(String bgUserId) {
        this.bgUserId = bgUserId;
    }

    public String getBgUserAccount() {
        return BgUserAccount;
    }

    public void setBgUserAccount(String bgUserAccount) {
        BgUserAccount = bgUserAccount;
    }

    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
