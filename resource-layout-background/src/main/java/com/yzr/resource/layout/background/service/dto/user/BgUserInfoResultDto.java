package com.yzr.resource.layout.background.service.dto.user;

public class BgUserInfoResultDto {
    private String bgUserId;
    private String bgUserName;
    private String bgUserAccount;
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "BgUserInfoResultDto{" +
                "bgUserId='" + bgUserId + '\'' +
                ", bgUserName='" + bgUserName + '\'' +
                ", bgUserAccount='" + bgUserAccount + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
