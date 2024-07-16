package com.cod.market.base.initData;

import com.cod.market.member.entity.Member;
import com.cod.market.member.service.MemberService;
import com.cod.market.product.service.ProductService;
import groovyjarjarpicocli.CommandLine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.UUID;

@Configuration
@Profile("dev")
public class DevInitData implements BeforeInitData{
    @Bean
    CommandLineRunner initData(MemberService memberService, ProductService productService){
        return args -> {
            beforeInit();

            String password = "{noop}1234";
            memberService.join("admin", password, "admin@test.com", "admin");
            memberService.join("user1", password, "user1@test.com", "user1");
            memberService.join("user2", password, "user2@test.com", "user2");
            memberService.join("user3", password, "user3@test.com", "user3");
            memberService.join("user4", password, "user4@test.com", "user4");


            productService.create("제목1", "설명1 입니다.", 10000);
            productService.create("제목2", "설명2 입니다.", 20000);
            productService.create("제목3", "설명3 입니다.", 30000);
            productService.create("제목4", "설명4 입니다.", 40000);
        };
    }
}
