package com.lixy.spring.cloud.common.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public interface IBaseEnum<T extends Serializable> extends IEnum<T> {

    Object getText();
}
