package com.example.demo.service;

import com.example.demo.domain.Cart;
import com.example.demo.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;

    public Cart findById(Long id){
        Cart cart = cartRepository.findById(id).get();
        System.out.println(cart.getItems());
        return cart;
    }
    public Cart save(Cart cart){
        return cartRepository.save(cart);
    }
}
