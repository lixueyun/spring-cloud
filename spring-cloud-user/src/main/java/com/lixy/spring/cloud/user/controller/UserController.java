package com.lixy.spring.cloud.user.controller;

import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.lixy.spring.cloud.common.response.HttpResult;
import com.lixy.spring.cloud.common.response.HttpResultBuilder;
import com.lixy.spring.cloud.user.controller.block.UserBlockHandler;
import com.lixy.spring.cloud.user.controller.fallback.UserFallback;
import com.lixy.spring.cloud.user.controller.response.UserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @ClassName  TestController
 * @Description
 * @Date  2019/12/24 14:25
 * @author  lixueyun
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping(value = "/getUserInfoByPhone", method = RequestMethod.GET)
    @SentinelResource(value = "getUserInfoByPhone", blockHandlerClass = UserBlockHandler.class, blockHandler = "getUserInfoByPhoneBlock", fallbackClass = UserFallback.class, fallback = "getUserInfoByPhoneFallback")
    public HttpResult<UserResponse> getUserInfoByPhone (@RequestParam("phone") String phone) {
        log.info("根据手机号获取用户信息, phone:{}", phone);
        UserResponse response = new UserResponse();
        response.setId(1L);
        response.setName("李雪云");
        response.setAge(18);
        response.setSex(0);
        response.setPhone("16630091355");
        response.setBirthday(LocalDateTime.now());
        return HttpResultBuilder.success(response);
    }


}
