package com.yzr.resource.laout.background.controller.vo.overall;

import com.yzr.resource.laout.background.controller.vo.operator.BgOperationUser;

/**
 * 请求参数包装封装对象
 */
public class ReqParamWarp<T> {
    /**
     * 请求参数
     */
    private T param;
    /**
     * 后台操作用户
     */
    private BgOperationUser bgOperationUser;

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }

    public BgOperationUser getBgOperationUser() {
        return bgOperationUser;
    }

    public void setBgOperationUser(BgOperationUser bgOperationUser) {
        this.bgOperationUser = bgOperationUser;
    }

    @Override
    public String toString() {
        return "ReqParamWarp{" +
                "param=" + param +
                ", bgOperationUser=" + bgOperationUser +
                '}';
    }
}
