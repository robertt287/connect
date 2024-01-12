package com.example.conenct.services;

import com.example.conenct.models.dtos.CustomerDTO;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    CustomerDTO createCustomer(CustomerDTO customerDTO);
}
