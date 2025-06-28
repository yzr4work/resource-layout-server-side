package com.yzr.resource.layout.background.dao.entity;

import org.apache.ibatis.type.Alias;

@Alias("BgUserEntity")
public class BgUserEntity {
    /**
     * 后台用户Id
     */
    private String bgUserId;
    /**
     * 后台用户名称
     */
    private String bgUserName;
    /**
     * 后台用户账号
     */
    private String bgUserAccount;
    /**
     * 后台用户密码
     */
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
}
