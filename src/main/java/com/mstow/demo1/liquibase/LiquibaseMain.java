package com.mstow.demo1.liquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:liquibase/application.properties")
public class LiquibaseMain {

    public static void main(String[] args) {
        SpringApplication.run(LiquibaseMain.class, args);
    }
}
