package com.example.connect.models.dtos;

import com.example.connect.models.entities.Customer;
import com.example.connect.models.entities.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrdersDTO {

    private Long id;

    private LocalDateTime createdAt;

    private Customer customer;

    private List<Product> products = new ArrayList<>();
}
