package com.example.conenct.models.dtos;

import com.example.conenct.models.entities.ProductCategory;
import com.example.conenct.models.entities.Customer;
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
