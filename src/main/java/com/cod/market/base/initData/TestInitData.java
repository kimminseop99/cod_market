package com.cod.market.base.initData;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("tests")
public class TestInitData implements BeforeInitData{
    @Bean
    CommandLineRunner initData(){
        return args -> {
            beforeInit();
        };
    }
}