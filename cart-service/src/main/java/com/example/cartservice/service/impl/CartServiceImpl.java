package com.example.cartservice.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cartservice.dto.CartDto;
import com.example.cartservice.entity.Cart;
import com.example.cartservice.repository.CartRepository;
import com.example.cartservice.service.CartService;


@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository cartRepository;

    @Override
    public CartDto addToCart(CartDto cartDto) {

        Cart cart = cartDto.toDto(Cart.class);

        return cartRepository.save(cart).toDto(CartDto.class);

    }

    @Override
    public List<CartDto> getCartProducts() {
        return cartRepository.findAll()
                .stream()
                .map(cart -> cart.toDto(CartDto.class))
                .collect(Collectors.toList());
    }

}
