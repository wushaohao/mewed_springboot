package com.wh.example.badguy.util;

/**
 * @Author:wuhao
 * @Description:
 * @Date:17/8/30
 */
public class Result<T> {
    /** 报错码 **/
    private Integer resCode;

    /** 报错信息 **/
    private String resDesc;

    /** 具体内容 **/
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getResCode() {
        return resCode;
    }

    public void setResCode(Integer resCode) {
        this.resCode = resCode;
    }

    public String getResDesc() {
        return resDesc;
    }

    public void setResDesc(String resDesc) {
        this.resDesc = resDesc;
    }
}
