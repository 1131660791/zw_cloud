package com.base.feign.user;

import com.base.hystrix.user.UserFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "zw-base",path = "/userClient",fallbackFactory = UserFeignHystrix.class)
public interface UserFeign {

    @RequestMapping(value = "/getUser")
    String getUser();
}