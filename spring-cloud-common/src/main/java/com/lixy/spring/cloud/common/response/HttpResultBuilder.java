package com.lixy.spring.cloud.common.response;

import com.lixy.spring.cloud.common.enums.ResultCodeEnum;

/**
 * @ClassName  HttpResultBuilder
 * @Description
 * @Date  2019/12/25 15:11
 * @author  lixueyun
 */
public class HttpResultBuilder {

    public static <T> HttpResult<T> success(){
        HttpResult<T> result = new HttpResult<>();
        result.setSuccess(true);
        result.setCode(ResultCodeEnum.E200.getValue());
        return result;
    }


    public static <T> HttpResult<T> success(T t){
        HttpResult<T> result = new HttpResult<>();
        result.setSuccess(true);
        result.setCode(ResultCodeEnum.E200.getValue());
        result.setData(t);
        return result;
    }

    public static <T> HttpResult<T> faile(ResultCodeEnum code){
        HttpResult<T> result = new HttpResult<>();
        result.setSuccess(false);
        result.setCode(code.getValue());
        result.setMessage(code.getText());
        return result;
    }

    public static <T> HttpResult<T> faile(Integer code, String message){
        HttpResult<T> result = new HttpResult<>();
        result.setSuccess(false);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

}
