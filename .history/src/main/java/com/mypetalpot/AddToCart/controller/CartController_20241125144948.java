package com.mypetalpot.AddToCart.controller;

import com.mypetalpot.AddToCart.model.CartItem;
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

    // displaying products in the store
    @GetMapping("/products")
    public String showProducts(Model model) {
        List<Product> products = cartService.getAllProducts();
        model.addAttribute("products", products);
        return "products";
    }

    // adding products from store to cart
    @PostMapping("/add")
    public String addToCart(@RequestParam Long productId, @RequestParam int quantity) {
        cartService.addProductToCart(productId, quantity);
        return "redirect:/cart/view";
    }

    // viewing products in the cart
    @GetMapping("/view")
    public String viewCart(Model model) {
        List<CartItem> cartItems = cartService.getAllCartItems();
        model.addAttribute("items", cartService.getCartItems());
        model.addAttribute("totalPrice", cartService.getTotalPrice());
        return "cart";
    }
}
