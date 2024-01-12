package com.example.conenct.services;

import com.example.conenct.exceptions.DuplicateCustomerException;
import com.example.conenct.models.dtos.CustomerDTO;
import com.example.conenct.models.entities.Customer;
import com.example.conenct.repositories.CustomerRepository;
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
