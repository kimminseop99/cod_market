package com.cod.market.market.service;

import com.cod.market.product.service.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
public class ProductServiceTests {
    @Autowired
    private ProductService productService;

    @Test
    @DisplayName("강의 제품 생성")
    void test1(){
        for(int i = 1; i <=200; i++){
            String name = String.format("테스트 상품:[%03d]", i);
            String description = String.format("테스트 설명:[%03d]", i);
            int price = i*i;

            /*productService.create(name, description, price);*/
        }
    }
}
