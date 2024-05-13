package com.yzr.resource.layout.background.controller.vo.user;

public class BgUserListRespVo {
    private String bgUserId;
    private String bgUserName;
    private String bgUserAccount;

    public BgUserListRespVo() {
    }

    public BgUserListRespVo(String bgUserId, String bgUserName, String bgUserAccount) {
        this.bgUserId = bgUserId;
        this.bgUserName = bgUserName;
        this.bgUserAccount = bgUserAccount;
    }

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
        return "BgUserListRespVo{" +
                "bgUserId='" + bgUserId + '\'' +
                ", bgUserName='" + bgUserName + '\'' +
                ", bgUserAccount='" + bgUserAccount + '\'' +
                '}';
    }
}
