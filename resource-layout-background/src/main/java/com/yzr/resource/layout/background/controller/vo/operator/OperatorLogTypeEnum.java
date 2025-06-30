package com.yzr.resource.layout.background.controller.vo.operator;

/**
 * 后台操作日志类型枚举
 */
public enum OperatorLogTypeEnum {
    CREATE_BG_USER(1,"创建后台用户"),
    DEL_BG_USER(2,"删除后台用户"),
    ;
    /**
     * 类型
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

    OperatorLogTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
