package com.lixy.spring.cloud.user.controller.block;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lixy.spring.cloud.common.enums.ResultCodeEnum;
import com.lixy.spring.cloud.common.response.HttpResult;
import com.lixy.spring.cloud.common.response.HttpResultBuilder;
import com.lixy.spring.cloud.user.controller.response.UserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName  UserBlockHandler
 * @Description
 * @Date  2019/12/26 14:37
 * @author  lixueyun
 */
@Slf4j
public class UserBlockHandler {

    public static HttpResult<UserResponse> getUserInfoByPhoneBlock (String phone, BlockException ex){
        log.info("系统出现block异常,ex:{}", ex.getMessage());
        return HttpResultBuilder.faile(ResultCodeEnum.E500.getValue(), ex.getMessage());
    }

}
