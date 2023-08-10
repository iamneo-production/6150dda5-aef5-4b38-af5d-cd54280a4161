package com.example.cartservice.service;

import java.util.List;

import com.example.cartservice.dto.CartDto;

public interface CartService {
    
    CartDto addToCart(CartDto cartDto);

    List<CartDto> getCartProducts();

}
