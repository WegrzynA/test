package com.mstow.demo1.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("configuration")
public class ConfigurationController {

    @Autowired
    ConfigurationRepository configurationRepository;

    @GetMapping
    public List<Configuration> getConfigurations() {
        return configurationRepository.findAll();
    }
}
