package com.mypetalpot.AddToCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mypetalpot.AddToCart.model.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
