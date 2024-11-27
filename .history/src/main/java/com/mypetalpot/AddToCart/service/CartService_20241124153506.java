package com.mypetalpot.AddToCart.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mypetalpot.AddToCart.model.Cart;

@Service
@Scope("session")
public class CartService {
    private Cart cart = new Cart();

    public void addProductToCart(Product product, int )
}
