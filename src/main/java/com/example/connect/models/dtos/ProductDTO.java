package com.example.connect.models.dtos;

import com.example.connect.models.entities.ProductCategory;
import com.example.connect.models.entities.Customer;
import lombok.Data;

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
