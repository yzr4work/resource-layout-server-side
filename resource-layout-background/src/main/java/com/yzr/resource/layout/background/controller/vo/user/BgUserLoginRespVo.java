package com.yzr.resource.layout.background.controller.vo.user;

public class BgUserLoginRespVo {
    private String bgUserToken;
    private String bgUserName;

    public String getBgUserToken() {
        return bgUserToken;
    }

    public void setBgUserToken(String bgUserToken) {
        this.bgUserToken = bgUserToken;
    }

    public String getBgUserName() {
        return bgUserName;
    }

    public void setBgUserName(String bgUserName) {
        this.bgUserName = bgUserName;
    }

    @Override
    public String toString() {
        return "BgUserLoginRespVo{" +
                "bgUserToken='" + bgUserToken + '\'' +
                ", bgUserName='" + bgUserName + '\'' +
                '}';
    }
}
