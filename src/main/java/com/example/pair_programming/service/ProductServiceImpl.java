package com.example.pair_programming.service;

import com.example.pair_programming.dto.ProductDTO;
import com.example.pair_programming.entity.Product;
import com.example.pair_programming.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;


    @Override
    public ProductDTO save(ProductDTO productDTO) {
        Product savedProdcut = productRepository.save(ProductDTO.convertDtoToEntity(productDTO));
        return ProductDTO.convertEntityToDto(savedProdcut);
    }

    @Override
    public ProductDTO find(int id) {
        Optional<Product> product = productRepository.findById(id);
        return product.map(ProductDTO::convertEntityToDto).orElse(null);
    }

    @Override
    public List<ProductDTO> findAll() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(ProductDTO::convertEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(int id) {

    }
}
