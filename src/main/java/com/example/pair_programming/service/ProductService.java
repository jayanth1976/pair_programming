package com.example.pair_programming.service;

import com.example.pair_programming.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    public ProductDTO save(ProductDTO product);
    public ProductDTO find(int id);
    public List<ProductDTO> findAll();
    public void deleteById(int id);
}
