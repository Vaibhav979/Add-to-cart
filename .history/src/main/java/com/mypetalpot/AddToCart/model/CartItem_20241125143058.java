package com.mypetalpot.AddToCart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class CartItem { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Product product;

    private int quantity;
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
