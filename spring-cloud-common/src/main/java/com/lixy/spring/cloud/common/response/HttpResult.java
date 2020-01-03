package com.lixy.spring.cloud.common.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName  HttpResult
 * @Description
 * @Date  2019/12/24 14:36
 * @author  lixueyun
 */
@Setter
@Getter
@ToString
public class HttpResult<T> implements Serializable {

    private static final long serialVersionUID = -7279386246722473459L;

    /**
     * 成功标示
     */
    private Boolean success;
    /**
     * 返回状态码
     */
    private Integer code;

    /**
     * 返回对象
     */
    private T data;

    /**
     * 返回错误信息
     */
    private String message;

}
