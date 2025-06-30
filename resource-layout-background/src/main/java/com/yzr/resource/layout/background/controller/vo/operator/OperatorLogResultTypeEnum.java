package com.yzr.resource.layout.background.controller.vo.operator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 后台操作日志结果类型枚举
 */
public enum OperatorLogResultTypeEnum {
    SUCCESS(1,"成功",
            OperatorLogTypeEnum.CREATE_BG_USER,OperatorLogTypeEnum.DEL_BG_USER),
    FAIL(2,"失败",
            OperatorLogTypeEnum.CREATE_BG_USER,OperatorLogTypeEnum.DEL_BG_USER),

    ;
    /**
     * 状态码
     */
    private final Integer code;
    /**
     * 描述
     */
    private final String desc;
    /**
     * 适用的后台操作日志类型集合
     */
    private final List<OperatorLogTypeEnum> scop;

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public List<OperatorLogTypeEnum> getScop() {
        return scop;
    }

    OperatorLogResultTypeEnum(Integer code, String desc, OperatorLogTypeEnum... scopList) {
        this.code = code;
        this.desc = desc;
        this.scop = Arrays.stream(scopList).collect(Collectors.toList());
    }
}
