package com.mypetalpot.AddToCart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypetalpot.AddToCart.model.Product;
import com.mypetalpot.AddToCart.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product findById(Long id){
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }
}
