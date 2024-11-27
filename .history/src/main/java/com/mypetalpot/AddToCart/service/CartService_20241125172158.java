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
        }else{
            CartItem newCartItem = new CartItem(product, quantity);
            cartItemRepository.save(newCart)
        }
    }

    public List<CartItem> getCartItems() {
        return cart.getItems();
    }

    public double getTotalPrice() {
        return cart.getTotalPrice();
    }

    // gets all products from the store
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public double calculateTotalCartPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateTotalCartPrice'");
    }

    public List<CartItem> getAllCartItems() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCartItems'");
    }
}
