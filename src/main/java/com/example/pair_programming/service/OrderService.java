package com.example.pair_programming.service;

import com.example.pair_programming.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    public List<OrderDTO> getAllOrders();
}
