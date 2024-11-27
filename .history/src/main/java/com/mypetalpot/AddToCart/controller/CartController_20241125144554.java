package com.mypetalpot.AddToCart.controller;

import com.mypetalpot.AddToCart.model.Product;
import com.mypetalpot.AddToCart.service.CartService;
import com.mypetalpot.AddToCart.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;


    @GetMapping("/products")
    public String showProducts(Model model) {
        List<Product> products = cartService.getAllProducts();
    }
    

    @PostMapping("/add")
    public String addToCart(@RequestParam Long productId, @RequestParam int quantity) {
        Product product = productService.findById(productId);
        if (product != null) {
            cartService.addProductToCart(product, quantity);
        }
        return "redirect:/cart/view";
    }

    @GetMapping("/view")
    public String viewCart(Model model) {
        model.addAttribute("items", cartService.getCartItems());
        model.addAttribute("totalPrice", cartService.getTotalPrice());
        return "cart";
    }
}
