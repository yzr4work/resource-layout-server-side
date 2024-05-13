package com.yzr.resource.layout.background.controller.vo.overall;

/**
 * 响应状态码枚举
 */
public enum RespCodeEnum {
    SUCCESS(0,"成功"),
    SYSTEM_ERROR(-1,"系统错误,请联系相关人员"),
    LOGIN_FAIL(-2,"登录失败,请重试"),
    REMOTE_LOGIN(-3, "账号已异地登录,请重新登录"),
    INSUFFICIENT_PERMISSIONS(-4, "权限不足,请联系相关人员"),
    ;
    /**
     * 状态码
     */
    private final Integer code;
    /**
     * 描述
     */
    private final String desc;

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    RespCodeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }


}
