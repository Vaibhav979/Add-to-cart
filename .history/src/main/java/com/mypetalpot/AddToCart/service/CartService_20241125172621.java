package com.mypetalpot.AddToCart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mypetalpot.AddToCart.model.CartItem;
import com.mypetalpot.AddToCart.model.Product;
import com.mypetalpot.AddToCart.repository.CartItemRepository;
import com.mypetalpot.AddToCart.repository.ProductRepository;

@Service
@Scope("session")
public class CartService {

    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private ProductRepository productRepository;

    // adds product to the cart
    public void addProductToCart(Long productId, int quantity) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        // if product already exists in the cart
        Optional<CartItem> existingCartItem = cartItemRepository.findAll().stream()
                .filter(item -> item.getProduct().getId().equals(productId)).findFirst();

        if (existingCartItem.isPresent()) {
            CartItem cartItem = existingCartItem.get();
            cartItem.setQuantity(cartItem.getQuantity() + quantity);
            cartItemRepository.save(cartItem);
        } else { // else creating new object for
            CartItem newCartItem = new CartItem(product, quantity);
            cartItemRepository.save(newCartItem);
        }
    }

    // to get all products from the cart
    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    // gets all products from the store
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // gets the total price of items 
    public double calculateTotalCartPrice() {
        return cartItemRepository.findAll().stream().mapToDouble()
    }
}
