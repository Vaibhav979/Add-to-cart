package com.mypetalpot.AddToCart.service;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mypetalpot.AddToCart.model.CartItem;
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

    public double getTotalPrice(){
        return cart.getTotalPrice();
    }

    public List<Products> getAllProducts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllProducts'");
    }

    public double calculateTotalCartPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateTotalCartPrice'");
    }

    public List<CartItem> getAllCartItems() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCartItems'");
    }
}
