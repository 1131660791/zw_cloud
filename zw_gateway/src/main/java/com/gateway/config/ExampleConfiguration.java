package com.gateway.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import reactor.core.publisher.Mono;


/**
 * 当请求进入（并与路由匹配）时，筛选Web Handler 会将GlobalFilter的所有实例和所有的GatewayFilter路由特定实例添加到 filter chain。
 * filter组合的排序由org.springframework.core.Ordered接口决定，可以通过实现getOrde()方法或使用@Order注释来设置。
 * 由于Spring Cloud Gateway将用于执行过滤器逻辑区分为“前置”和“后置”阶段，具有最高优先级的过滤器将是“前置”阶段的第一个，而“后置”阶段的最后一个。
 */
@Slf4j
public class ExampleConfiguration {

//    @Bean
//    @Order(-1)
//    public GlobalFilter a() {
//        return (exchange, chain) -> {
//            log.info("first pre filter");
//            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
//                log.info("third post filter");
//            }));
//        };
//    }
//
//    @Bean
//    @Order(0)
//    public GlobalFilter b() {
//        return (exchange, chain) -> {
//            log.info("second pre filter");
//            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
//                log.info("second post filter");
//            }));
//        };
//    }
//
//    @Bean
//    @Order(1)
//    public GlobalFilter c() {
//        return (exchange, chain) -> {
//            log.info("third pre filter");
//            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
//                log.info("first post filter");
//            }));
//        };
//    }

}