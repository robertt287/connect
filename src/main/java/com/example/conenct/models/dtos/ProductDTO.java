package com.example.conenct.models.dtos;

import com.example.conenct.models.ProductCategory;
import com.example.conenct.models.entities.Customer;
import com.example.conenct.models.entities.Order;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class ProductDTO {

    private Long id;

    private String productName;

    private Map<Customer, Double> customerRatings;

    private Map<Customer, Double> customerReviews;

    private Double productPrice;

    private ProductCategory productCategory;

    private String productDescription;

}
