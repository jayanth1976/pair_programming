package com.example.pair_programming.controller;

import com.example.pair_programming.dto.CustomerDTO;
import com.example.pair_programming.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("")
    public List<CustomerDTO> getAllCustomers(){
        return customerService.getAllCustomers();
    }
}
