package com.andrnhd.mvptest.api;

/**
 * 返回结果类
 * Created by nhd on 2017/3/27.
 */

public class HttpResult<T> {
    private int code;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
