package com.mypetalpot.AddToCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypetalpot.AddToCart.model.Product;

@Re
public interface ProductRepository extends JpaRepository<Product, Long> {

}
