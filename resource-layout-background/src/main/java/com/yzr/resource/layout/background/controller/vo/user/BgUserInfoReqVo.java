package com.yzr.resource.layout.background.controller.vo.user;

public class BgUserInfoReqVo {
    private String bgUserId;

    public String getBgUserId() {
        return bgUserId;
    }

    public void setBgUserId(String bgUserId) {
        this.bgUserId = bgUserId;
    }

    @Override
    public String toString() {
        return "BgUserInfoReqVo{" +
                "bgUserId='" + bgUserId + '\'' +
                '}';
    }
}
