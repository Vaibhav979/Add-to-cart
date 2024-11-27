package com.mypetalpot.AddToCart.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenertionType.IDENTITY)
    private Long id;
    private String name;
    private double price;
}
