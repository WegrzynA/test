package com.mstow.demo1.swagger;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ConfigurationRepositoryTest {

    @Autowired
    ConfigurationRepository configurationRepository;

    @Test
    public void testSaveAndLoad() {
        Configuration configuration = configurationRepository.save(new Configuration());

        Assertions.assertThat(configurationRepository.findAll()).contains(configuration);
    }
}