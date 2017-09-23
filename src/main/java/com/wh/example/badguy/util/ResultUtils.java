package com.wh.example.badguy.util;

/**
 * @Author:wuhao
 * @Description:结果处理类
 * @Date:17/8/30
 */
public class ResultUtils {
    public static Result success(Object object){
        Result result = new Result();
        result.setResCode(0);
        result.setResDesc("成功");
        result.setData(object);
        return result;
    }

    public  static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String desc){
        Result result = new Result();
        result.setResCode(code);
        result.setResDesc(desc);
        result.setData("");
        return result;
    }
}
