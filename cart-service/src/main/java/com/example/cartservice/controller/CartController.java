package com.example.cartservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cartservice.dto.CartDto;
import com.example.cartservice.service.CartService;

@RestController
@RequestMapping("api/cart")
public class CartController {
    
    @Autowired
    CartService cartservice;


    @PostMapping
    public ResponseEntity<CartDto> addToCart(@RequestBody CartDto cartDto){
        return ResponseEntity.ok(cartservice.addToCart(cartDto));
    }


    @GetMapping
    public ResponseEntity<List<CartDto>> cartList(){
        return ResponseEntity.ok(cartservice.getCartProducts());
    }
}