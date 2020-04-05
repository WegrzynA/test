package com.mstow.demo1.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanProvider {

    @Bean
    public C getC() {
        return new C();
    }
}
