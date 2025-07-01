package com.yzr.resource.layout.background.controller.vo.user;

public class BgUserLoginReqVo {
    /**
     * 后台用户账号
     */
    private String bgUserAccount;
    /**
     * 密码
     */
    private String password;

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
        return "BgUserLoginReqVo{" +
                "bgUserAccount='" + bgUserAccount + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
