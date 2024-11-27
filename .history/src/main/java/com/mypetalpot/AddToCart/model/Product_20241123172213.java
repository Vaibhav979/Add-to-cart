package com.mypetalpot.AddToCart.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenertionType.IDENTITY)
    private Long id;
    
}
