package com.bear.start.domain;

/**
 * 状态
 * @author xiaoxiong
 * @date 2020/3/15
 */
public class Status {
    private String code;
    private Object data;
    private Object msg;

    public Status(String code, Object data, Object msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public Status(String code, Object data) {

        this.code = code;
        this.data = data;
    }

    public String getCode() {

        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }
}
