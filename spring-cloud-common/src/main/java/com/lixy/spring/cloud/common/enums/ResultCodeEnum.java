package com.lixy.spring.cloud.common.enums;


/**
 * @ClassName  ResultCodeEnum
 * @Description
 * @author  lixueyun
 * @Date  2019/9/24 20:50
 */
public enum ResultCodeEnum implements IBaseEnum<Integer> {

    E200(200, "请求成功!"),

    E401(401, "需要身份认证!"),
    E403(403, "身份认证失败!"),

    E500(500, "系统错误!"),

    ;

    private Integer value;

    private String text;

    ResultCodeEnum(final Integer value, final String text) {
        this.value = value;
        this.text = text;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String getText() {
        return text;
    }
}
