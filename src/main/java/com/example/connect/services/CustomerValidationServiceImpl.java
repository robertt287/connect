package com.example.connect.services;

import com.example.connect.exceptions.DuplicateCustomerException;
import com.example.connect.models.dtos.CustomerDTO;
import com.example.connect.models.entities.Customer;
import com.example.connect.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerValidationServiceImpl implements CustomerValidationService{
    private final CustomerRepository customerRepository;

    public CustomerValidationServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void validateUniqueCustomer(CustomerDTO customerDTO) {
        Customer foundCustomer = customerRepository.findByEmail(customerDTO.getEmail());
        if(foundCustomer!=null){
            throw new DuplicateCustomerException("Email already exists!");
        }
    }
}
