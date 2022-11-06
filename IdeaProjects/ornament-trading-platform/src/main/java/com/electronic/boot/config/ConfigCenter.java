package com.electronic.boot.config;

import com.electronic.boot.interceptor.LoginInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@MapperScan(basePackages = "com.electronic.boot.mapper")
public class ConfigCenter {
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        /*配置登录拦截器*/
        return new WebMvcConfigurer() {
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginInterceptor())
                        .addPathPatterns("/**")
                        .excludePathPatterns("/rechargeRecord/dealRechargeRecordWithSuccess","/alipayResult","/user/**","/","/login","/login.html","/dist/**","/static/**","/jquery/**");
            }
        };
    }
}
