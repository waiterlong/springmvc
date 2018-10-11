package com.gutongxue.util;

/**
 * @FileName : (WebResp.java)
 *
 * @description : Ajax 请求 Resp 封装实体
 * @author : XX
 * @version : Version No.1
 * @create : 2015-5-25 下午04:07:23
 * @modify : 2015-5-25 下午04:07:23
 * @copyright : FiberHome FHZ Telecommunication Technologies Co.Ltd.
 */
public class WebResp {

    private String errorCode;   //错误码

    private Object resp;        //返回结果

    private int status;         //请求处理状态

    public static int STATE_SUCCESS = 1; //请求成功

    public static int STATE_FAILURE = 0; //请求失败

    public WebResp() {
        // TODO Auto-generated constructor stub
    }

    public WebResp(String errorCode, Object resp, int status) {
        super();
        this.errorCode = errorCode;
        this.resp = resp;
        this.status = status;
    }

    public WebResp(String errorCode, int status) {
        super();
        this.errorCode = errorCode;
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Object getResp() {
        return resp;
    }

    public void setResp(Object resp) {
        this.resp = resp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}

