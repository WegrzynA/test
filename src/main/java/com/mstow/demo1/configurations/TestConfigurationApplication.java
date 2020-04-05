package com.mstow.demo1.configurations;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

public class TestConfigurationApplication {

    public static void main(String[] args) {
        Class<?> primarySource = TestConfigurationAuto.class;
//        Class<?> primarySource = TestConfigurationManual.class;
        ConfigurableApplicationContext applicationContext = SpringApplication.run(primarySource, args);
        printBeans(applicationContext);
    }

    public static void printBeans(ApplicationContext applicationContext) {
        List<String> elements = Arrays.asList(applicationContext.getBeanDefinitionNames());
        System.out.println("Beans: " + elements.size());
//        System.out.println(String.join("\n", elements));
    }
}
