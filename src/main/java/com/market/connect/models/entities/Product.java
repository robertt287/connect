package com.market.connect.models.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Map;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @ElementCollection
    @CollectionTable(name = "customer_ratings", joinColumns = @JoinColumn(name = "customer_ratings"))
    @MapKeyColumn(name = "customer_email")
    @Column(name = "ratings")
    private Map<Customer, Double> customerRatings;

    @ElementCollection
    @CollectionTable(name = "customer_reviews", joinColumns = @JoinColumn(name = "customer_reviews"))
    @MapKeyColumn(name = "customer_email")
    @Column(name = "ratings")
    private Map<Customer, Double> customerReviews;

    @Column(name = "product_price")
    private Double productPrice;

    @Column(name = "product_category")
    private ProductCategory productCategory;

    @Column(name = "product_description")
    private String productDescription;
}
