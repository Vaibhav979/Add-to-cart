package com.mypetalpot.AddToCart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class Product { // st
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name; // name of the product
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
