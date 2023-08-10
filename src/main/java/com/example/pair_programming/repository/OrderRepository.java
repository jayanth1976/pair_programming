package com.example.pair_programming.repository;

import com.example.pair_programming.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order,Integer> {
}
