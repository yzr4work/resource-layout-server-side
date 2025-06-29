package com.yzr.resource.layout.background.service.dto.user;

/**
 * 删除后台用户参数
 */
public class DeleteBgUserDto {
    /**
     * 后台用户Id
     */
    private String bgUserId;
    /**
     * 后台用户账号
     */
    private String bgUserAccount;

    public String getBgUserId() {
        return bgUserId;
    }

    public void setBgUserId(String bgUserId) {
        this.bgUserId = bgUserId;
    }

    public String getBgUserAccount() {
        return bgUserAccount;
    }

    public void setBgUserAccount(String bgUserAccount) {
        this.bgUserAccount = bgUserAccount;
    }
}
