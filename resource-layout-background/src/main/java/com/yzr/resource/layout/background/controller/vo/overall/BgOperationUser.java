package com.yzr.resource.layout.background.controller.vo.overall;

/**
 * 后台操作用户信息
 */
public class BgOperationUser {
    private String bgUserId;
    private String bgUserAccount;
    private String operationTime;

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

    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    @Override
    public String toString() {
        return "BgOperationUser{" +
                "bgUserId='" + bgUserId + '\'' +
                ", bgUserAccount='" + bgUserAccount + '\'' +
                ", operationTime='" + operationTime + '\'' +
                '}';
    }
}
