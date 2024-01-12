package com.example.conenct.models.dtos;

import com.example.conenct.models.entities.Customer;
import com.example.conenct.models.entities.Product;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrdersDTO {

    private Long id;

    private LocalDateTime createdAt;

    private Customer customer;

    private List<Product> products = new ArrayList<>();
}
