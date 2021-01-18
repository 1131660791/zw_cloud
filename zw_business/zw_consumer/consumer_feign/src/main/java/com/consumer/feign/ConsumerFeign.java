package com.consumer.feign;

import com.consumer.hystrix.ConsumerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "consumer", path = "/consumerFeign", fallbackFactory = ConsumerHystrix.class)
public interface ConsumerFeign {

    @RequestMapping(value = "/consumerS")
    String consumerS();


}