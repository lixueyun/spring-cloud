package com.lixy.spring.cloud.user.controller.response;

import lombok.*;

import java.time.LocalDateTime;

/**
 * @ClassName  TestResponse
 * @Description
 * @Date  2019/12/24 14:26
 * @author  lixueyun
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
public class UserResponse {

    private Long id;

    private String name;

    private Integer age;

    private Integer sex;

    private String phone;

    private LocalDateTime birthday;

}
