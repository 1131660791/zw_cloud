package com.gateway.config;


import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.RedirectServerAuthenticationEntryPoint;

/**
 * gateWay整合Security
 * 在webflux环境下要生效必须用注解
 */
@EnableWebFluxSecurity
public class WebSecurityConfig {

    // security的鉴权排除的url列表
    private static final String[] excludedAuthPages = {
            "/auth/login","/auth/logout","/health","/api/socket/**"
    };

    @Bean
    public SecurityWebFilterChain webFluxSecurityFilterChain(ServerHttpSecurity http) throws Exception {
        http
                .formLogin().loginPage("/xinyue-server-a/account/authen").authenticationEntryPoint(new RedirectServerAuthenticationEntryPoint("/xinyue-server-a/account/index")) // 自定义登录页面
                .and()
                .authorizeExchange()
                .pathMatchers(excludedAuthPages).permitAll()  //无需进行权限过滤的请求路径
                .pathMatchers(HttpMethod.OPTIONS).permitAll() //option 请求默认放行
                .anyExchange().authenticated()  // 其它请求都必须是认证（登陆成功）之后才可以访问。
                .and()
                .httpBasic()
                .and()
                .formLogin() //启动页面表单登陆,spring security 内置了一个登陆页面/login
                .and().csrf().disable()//必须支持跨域
                .logout().disable();
        return http.build();
    }
}
