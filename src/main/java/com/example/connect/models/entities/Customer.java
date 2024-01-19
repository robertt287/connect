package com.example.connect.models.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email", unique = true)
    private String email;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}