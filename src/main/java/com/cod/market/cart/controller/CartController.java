package com.cod.market.cart.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {
    @PreAuthorize("isAuthenticated()")
    @GetMapping("/list")
    public String list(){
        return "cart/list";
    }
}