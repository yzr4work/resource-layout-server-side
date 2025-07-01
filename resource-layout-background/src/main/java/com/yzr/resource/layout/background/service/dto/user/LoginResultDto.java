package com.yzr.resource.layout.background.service.dto.user;

public class LoginResultDto {
    /**
     * 后台用户登录信息token
     */
    private String token;
    /**
     * 后台用户名称
     */
    private String bgUserName;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBgUserName() {
        return bgUserName;
    }

    public void setBgUserName(String bgUserName) {
        this.bgUserName = bgUserName;
    }
}
