package com.mypetalpot.AddToCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mypetalpot.AddToCart.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
