package com.lixy.spring.cloud.user.controller.fallback;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lixy.spring.cloud.common.enums.ResultCodeEnum;
import com.lixy.spring.cloud.common.response.HttpResult;
import com.lixy.spring.cloud.common.response.HttpResultBuilder;
import com.lixy.spring.cloud.user.controller.response.UserResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName  UserFallback
 * @Description
 * @Date  2019/12/26 14:38
 * @author  lixueyun
 */
@Slf4j
public class UserFallback {

    public static HttpResult<UserResponse> getUserInfoByPhoneFallback (String phone, Throwable ex){
        log.info("执行fallback处理,ex:{}", ex.getMessage());
        return HttpResultBuilder.faile(ResultCodeEnum.E500.getValue(), ex.getMessage());
    }
}
