package com.yzr.resource.layout.background.controller.vo.user;

public class BgUserCreateRespVo {
    private boolean result;
    private String bgUserName;
    private String bgUserAccount;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
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
        return "BgUserCreateRespVo{" +
                "result=" + result +
                ", bgUserName='" + bgUserName + '\'' +
                ", bgUserAccount='" + bgUserAccount + '\'' +
                '}';
    }
}
