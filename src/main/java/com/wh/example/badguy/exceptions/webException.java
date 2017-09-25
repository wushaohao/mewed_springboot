package com.wh.example.badguy.exceptions;

/**
 * @Author:wuhao
 * @Description:自定义异常信息
 * @Date:17/9/24
 */
public class webException extends RuntimeException{
    private String errorCode;

    public webException(MyException e) {
        super(e.getRESULT_DESC());
        this.errorCode = e.getRESULT_CODE();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
