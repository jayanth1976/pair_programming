package com.example.pair_programming.controller;

import com.example.pair_programming.dto.ProductDTO;
import com.example.pair_programming.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("")
    public ProductDTO saveProduct(@RequestBody ProductDTO productDTO){
        return productService.save(productDTO);
    }

    @GetMapping("/{productId}")
    public ProductDTO getProductById(@PathVariable int productId){
        return productService.find(productId);
    }

    @GetMapping("")
    public List<ProductDTO> getAllProducts(){
        return productService.findAll();
    }
}
