package com.example.pair_programming.controller;

import com.example.pair_programming.dto.OrderDTO;
import com.example.pair_programming.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("")
    public List<OrderDTO> getAllOrders(){
        return orderService.getAllOrders();
    }
}
