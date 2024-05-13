package com.yzr.resource.layout.background.controller.vo.user;

public class BgUserDeleteReqVo {
    private String bgUserAccount;
    private String bgUserId;

    public String getBgUserAccount() {
        return bgUserAccount;
    }

    public void setBgUserAccount(String bgUserAccount) {
        this.bgUserAccount = bgUserAccount;
    }

    public String getBgUserId() {
        return bgUserId;
    }

    public void setBgUserId(String bgUserId) {
        this.bgUserId = bgUserId;
    }

    @Override
    public String toString() {
        return "BgUserDeleteReqVo{" +
                "bgUserAccount='" + bgUserAccount + '\'' +
                ", bgUserId='" + bgUserId + '\'' +
                '}';
    }
}
