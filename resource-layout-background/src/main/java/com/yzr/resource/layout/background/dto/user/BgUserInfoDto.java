package com.yzr.resource.layout.background.dto.user;

public class BgUserInfoDto {
    private String bgUserId;
    private String bgUserName;

    public String getBgUserId() {
        return bgUserId;
    }

    public void setBgUserId(String bgUserId) {
        this.bgUserId = bgUserId;
    }

    public String getBgUserName() {
        return bgUserName;
    }

    public void setBgUserName(String bgUserName) {
        this.bgUserName = bgUserName;
    }

    @Override
    public String toString() {
        return "BgUserInfoDto{" +
                "bgUserId='" + bgUserId + '\'' +
                ", bgUserName='" + bgUserName + '\'' +
                '}';
    }
}
