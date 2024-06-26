package com.yzr.resource.layout.background.controller.vo.overall;

/**
 * 响应包装封装对象
 */
public class RespWarp<T> {
    private Integer code;
    private String message;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RespWarp{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    private RespWarp(T data) {
        this.data = data;
    }

    public RespWarp() {
    }

    public static <T> RespWarp<T> SUCCESS(T data){
        RespWarp<T> warp = new RespWarp<T>(data);
        warp.setCode(RespCodeEnum.SUCCESS.getCode());
        warp.setMessage(RespCodeEnum.SUCCESS.getDesc());
        return warp;
    }
    public static <T> RespWarp<T> BUSINESS_ERROR(T data,String desc){
        RespWarp<T> warp = new RespWarp<T>(data);
        warp.setCode(RespCodeEnum.BUSINESS_ERROR.getCode());
        warp.setMessage(desc);
        return warp;
    }

    public static <T> RespWarp<T> BUSINESS_ERROR(T data){
        RespWarp<T> warp = new RespWarp<T>(data);
        warp.setCode(RespCodeEnum.BUSINESS_ERROR.getCode());
        warp.setMessage(RespCodeEnum.BUSINESS_ERROR.getDesc());
        return warp;
    }
    public static  RespWarp BUSINESS_ERROR(){
        RespWarp warp = new RespWarp();
        warp.setCode(RespCodeEnum.BUSINESS_ERROR.getCode());
        warp.setMessage(RespCodeEnum.BUSINESS_ERROR.getDesc());
        return warp;
    }

}
