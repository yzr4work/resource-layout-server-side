package com.yzr.resource.layout.background.controller.vo.overall;

/**
 * 后台操作用户信息
 */
public class BgOperationUser {
    private String bgUid;
    private String userName;
    private String operationTime;

    public String getBgUid() {
        return bgUid;
    }

    public void setBgUid(String bgUid) {
        this.bgUid = bgUid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
                "bgUid='" + bgUid + '\'' +
                ", userName='" + userName + '\'' +
                ", operationTime='" + operationTime + '\'' +
                '}';
    }
}
