package com.sym.mmall.common;

/***
 * created by shiyumeng
 * date : 2019/9/24
 */
public enum ResponseCode {
    /**
     * 响应成功
     */
    SUCCESS(0,"SUCCESS"),
    /**
     * 响应失败
     */
    ERROR(1,"ERROR"),
    /**
     * 需要登陆
     */
    NEED_LOGIN(10,"NEED_LOGIN"),
    /**
     * 非法参数
     */
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;


    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }

}
