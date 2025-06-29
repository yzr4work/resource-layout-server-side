package com.yzr.resource.layout.background.service.dto.user;

/**
 * 创建后台用户参数
 */
public class CreateBgUserDto {
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
