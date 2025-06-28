package com.yzr.resource.layout.background.service.dto.operatorLog;

import java.time.LocalDateTime;

public class OperatorLogInfoListResultDto {
    /**
     * 操作记录Id
     */
    private Long logId;
    /**
     * 操作人Id
     */
    private String bgUserId;
    /**
     * 操作人账号
     */
    private String bgUserAccount;
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
        return bgUserAccount;
    }

    public void setBgUserAccount(String bgUserAccount) {
        this.bgUserAccount = bgUserAccount;
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
