package com.mypetalpot.AddToCart.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product findById(Long id){
        return productRepository.findById(id).orE
    }
}
