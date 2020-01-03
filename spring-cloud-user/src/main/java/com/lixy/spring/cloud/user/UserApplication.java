package com.lixy.spring.cloud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName  UserApplication
 * @Description
 * @Date  2019/12/24 14:12
 * @author  lixueyun
 */
@SpringBootApplication
//nacos
@EnableDiscoveryClient
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);

    }
}
