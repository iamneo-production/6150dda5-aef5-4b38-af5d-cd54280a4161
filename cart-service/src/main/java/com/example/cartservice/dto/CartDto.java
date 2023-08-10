package com.example.cartservice.dto;

import com.example.cartservice.utill.Transformer;

import lombok.Data;

@Data
public class CartDto implements Transformer{

    private int id;

    private int productId;

    private int qty; 

    private double unitPrice;
    
    private double price;
}