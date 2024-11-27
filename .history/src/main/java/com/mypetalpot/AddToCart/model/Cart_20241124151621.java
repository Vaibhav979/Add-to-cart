package com.mypetalpot.AddToCart.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void addProduct(Product product, int quantity){
        for(CartItem item : items){
            if(item.getProduct().getId().equals(product.getId())){
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public List<CartItem>
}
