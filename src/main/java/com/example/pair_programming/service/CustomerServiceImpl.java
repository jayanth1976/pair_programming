package com.example.pair_programming.service;

import com.example.pair_programming.dto.CustomerDTO;
import com.example.pair_programming.dto.ProductDTO;
import com.example.pair_programming.entity.Customer;
import com.example.pair_programming.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return customers.stream()
                .map(CustomerDTO::convertEntityToDto)
                .collect(Collectors.toList());
    }
}
