package com.wh.example.badguy.exceptions;

import com.wh.example.badguy.util.Result;
import com.wh.example.badguy.util.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:wuhao
 * @Description:异常信息处理类
 * @Date:17/9/24
 */
@ControllerAdvice
public class ExceptionHandler {
    private final static Logger log = LoggerFactory.getLogger(ExceptionHandler.class);

    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result hand(Exception e){
        if (e instanceof webException){
            webException exception = (webException) e;
            return ResultUtils.error(exception.getErrorCode(),exception.getMessage());
        }else{
            log.error("[系统异常]{}",e);
            return ResultUtils.error("-1", "未知错误 ");
        }
    }

}
