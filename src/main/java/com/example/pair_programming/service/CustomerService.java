package com.example.pair_programming.service;

import com.example.pair_programming.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    public List<CustomerDTO> getAllCustomers();
}
