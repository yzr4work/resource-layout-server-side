package com.yzr.resource.layout.background.service.dto.user;

public class BgUserInfoListResultDto {
    private String bgUserId;
    private String bgUserName;
    private String bgUserAccount;

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

    public String getBgUserAccount() {
        return bgUserAccount;
    }

    public void setBgUserAccount(String bgUserAccount) {
        this.bgUserAccount = bgUserAccount;
    }

    @Override
    public String toString() {
        return "BgUserInfoListDto{" +
                "bgUserId='" + bgUserId + '\'' +
                ", bgUserName='" + bgUserName + '\'' +
                ", bgUserAccount='" + bgUserAccount + '\'' +
                '}';
    }
}
