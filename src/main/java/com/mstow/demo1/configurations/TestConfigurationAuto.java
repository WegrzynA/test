package com.mstow.demo1.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.mstow.demo1")
public class TestConfigurationAuto {

   @Autowired
    C c;

}
