package com.example.connect.services;

import com.example.connect.models.dtos.CustomerDTO;
import org.springframework.stereotype.Service;

@Service
public interface CustomerValidationService {
    void validateUniqueCustomer(CustomerDTO customerDTO);
}
