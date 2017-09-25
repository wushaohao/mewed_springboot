package com.wh.example.badguy.exceptions;

/**
 * @Author:wuhao
 * @Description:异常枚举
 * @Date:17/9/24
 */
public enum  MyException{
    /***************通用异常信息******************/
    COMMON_EXCEPTION("1000","通用异常错误"),


    /**************自定义异常信息****************/
    FORBIDDEN_AGE("SOS1001","改年龄是被禁止的!!!!!");



    private String RESULT_CODE;
    private String RESULT_DESC;

    public String getRESULT_CODE() {
        return RESULT_CODE;
    }

    public void setRESULT_CODE(String RESULT_CODE) {
        this.RESULT_CODE = RESULT_CODE;
    }

    public String getRESULT_DESC() {
        return RESULT_DESC;
    }

    public void setRESULT_DESC(String RESULT_DESC) {
        this.RESULT_DESC = RESULT_DESC;
    }

    MyException(String RESULT_CODE, String RESULT_DESC) {
        this.RESULT_CODE = RESULT_CODE;
        this.RESULT_DESC = RESULT_DESC;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "RESULT_CODE='" + RESULT_CODE + '\'' +
                ", RESULT_DESC='" + RESULT_DESC + '\'' +
                '}';
    }
}
