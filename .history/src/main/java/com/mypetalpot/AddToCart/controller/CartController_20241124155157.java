package com.mypetalpot.AddToCart.controller;

import com.mypetalpot.AddToCart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/cart")
public class CartController {
    
    @Autowired
    private CartService CartService;

    @Autowired
    private ProductService productService;

    @PostMapping("add")
    public String addToCart(@RequestParam Long productId, @RequestParam int entity) {
        Product product = productService.find
        return entity;
    }
    
}
