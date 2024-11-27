package com.mypetalpot.AddToCart.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mypetalpot.AddToCart.model.Cart;
import com.mypetalpot.AddToCart.model.Product;

@Service
@Scope("session")
public class CartService {
    private Cart cart = new Cart();

    public void addProductToCart(Product product, int quantity){
        cart.addProduct(product, quantity);
    }

    public List<CartItem> getCartItems(){
        return cart.getItems();
    }
}
