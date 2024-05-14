package com.yzr.resource.layout.background.service.dto.user;

public class BgUserInfoDto {
    private String bgUserId;

    public String getBgUserId() {
        return bgUserId;
    }

    public void setBgUserId(String bgUserId) {
        this.bgUserId = bgUserId;
    }

    @Override
    public String toString() {
        return "BgUserInfoDto{" +
                "bgUserId='" + bgUserId + '\'' +
                '}';
    }
}
