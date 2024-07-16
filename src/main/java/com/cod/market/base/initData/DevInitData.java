package com.cod.market.base.initData;

import groovyjarjarpicocli.CommandLine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevInitData implements BeforeInitData{
    @Bean
    CommandLineRunner initData(){
        return args -> {
            beforeInit();
        };
    }
}
