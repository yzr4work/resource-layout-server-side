package com.yzr.resource.layout.background.controller.vo.user;

public class BgUserLoginRespVo {
    private String bgUserToken;
    private String bgUserId;

    public String getBgUserToken() {
        return bgUserToken;
    }

    public void setBgUserToken(String bgUserToken) {
        this.bgUserToken = bgUserToken;
    }

    public String getBgUserId() {
        return bgUserId;
    }

    public void setBgUserId(String bgUserId) {
        this.bgUserId = bgUserId;
    }

    @Override
    public String toString() {
        return "BgUserLoginRespVo{" +
                "bgUserToken='" + bgUserToken + '\'' +
                ", bgUserId='" + bgUserId + '\'' +
                '}';
    }
}
