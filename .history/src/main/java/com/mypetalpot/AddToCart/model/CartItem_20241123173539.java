package com.mypetalpot.AddToCart.model;

import lombok.Data;

@Data
public class CartItem {
    private Product product;
    private int quantity;
}
