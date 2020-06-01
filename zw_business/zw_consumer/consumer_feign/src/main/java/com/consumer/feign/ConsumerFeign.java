package com.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "consumer", path = "/consumerFeign", fallbackFactory = void.class)
public interface ConsumerFeign {


}