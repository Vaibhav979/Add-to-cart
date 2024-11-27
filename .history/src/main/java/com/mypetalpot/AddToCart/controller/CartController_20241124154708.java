package com.mypetalpot.AddToCart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("path", method=RequestMethod.GET)
public String requestMethodName(@RequestParam String param) {
    return new String();
}

public class CartController {
    
}
