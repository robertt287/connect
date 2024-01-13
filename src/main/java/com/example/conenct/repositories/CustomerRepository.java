package com.example.conenct.repositories;

import com.example.conenct.models.entities.Customer;
import com.example.conenct.services.CustomerService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String email);
}
