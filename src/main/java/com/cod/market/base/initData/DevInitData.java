package com.cod.market.base.initData;

import com.cod.market.member.entity.Member;
import com.cod.market.member.service.MemberService;
import com.cod.market.product.service.ProductService;
import groovyjarjarpicocli.CommandLine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevInitData implements BeforeInitData{
    @Bean
    CommandLineRunner initData(MemberService memberService, ProductService productService){
        return args -> {
            beforeInit();

            String password = "{noop}1234";
            memberService.join("user1", password, "user1@test.com", "user1");
            memberService.join("user2", password, "user2@test.com", "user2");
            memberService.join("user3", password, "user3@test.com", "user3");
            memberService.join("user4", password, "user4@test.com", "user4");
        };
    }
}