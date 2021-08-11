package com.example.demo.controller;

import com.example.demo.domain.Cart;
import com.example.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping
    public Cart getCart(@RequestParam("id") Long id){
        return cartService.findById(id);
    }

    @PostMapping("/save")
    public Cart save (@RequestBody Cart cart){
        return cartService.save(cart);
    }

}
