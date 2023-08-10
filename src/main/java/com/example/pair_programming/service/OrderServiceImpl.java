package com.example.pair_programming.service;

import com.example.pair_programming.dto.OrderDTO;
import com.example.pair_programming.entity.Order;
import com.example.pair_programming.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<OrderDTO> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        return orders.stream()
                .map(OrderDTO::convertEntityToDto)
                .collect(Collectors.toList());
    }
}
