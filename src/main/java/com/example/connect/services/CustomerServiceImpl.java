package com.example.connect.services;

import com.example.connect.models.dtos.CustomerDTO;
import com.example.connect.models.entities.Customer;
import com.example.connect.repositories.CustomerRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;
    private final CustomerValidationService customerValidationService;

    public CustomerServiceImpl(CustomerRepository customerRepository, ModelMapper modelMapper, CustomerValidationService customerValidationService) {
        this.customerRepository = customerRepository;
        this.modelMapper = modelMapper;
        this.customerValidationService = customerValidationService;
    }

    @Transactional
    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        customerValidationService.validateUniqueCustomer(customerDTO);
        Customer savedCustomer = customerRepository.save(modelMapper.map(customerDTO, Customer.class));
        log.info("Customer with id {} saved in data base", savedCustomer.getId());

        return modelMapper.map(savedCustomer, CustomerDTO.class);
    }
}
