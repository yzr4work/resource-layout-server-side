package com.yzr.resource.layout.background.controller.vo.user;

/**
 * 删除后台用户请求参数
 */
public class BgUserDeleteReqVo {
    /**
     * 后台用户Id
     */
    private String bgUserId;
    /**
     * 后台用户账号
     */
    private String bgUserAccount;

    public String getBgUserAccount() {
        return bgUserAccount;
    }

    public void setBgUserAccount(String bgUserAccount) {
        this.bgUserAccount = bgUserAccount;
    }

    public String getBgUserId() {
        return bgUserId;
    }

    public void setBgUserId(String bgUserId) {
        this.bgUserId = bgUserId;
    }

    @Override
    public String toString() {
        return "BgUserDeleteReqVo{" +
                "bgUserAccount='" + bgUserAccount + '\'' +
                ", bgUserId='" + bgUserId + '\'' +
                '}';
    }
}
