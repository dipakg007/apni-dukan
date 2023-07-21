package com.apnidukan.controllers;

import com.apnidukan.dto.ProductDto;
import com.apnidukan.entity.Product;
import com.apnidukan.mapper.ProductMapper;
import com.apnidukan.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAllProduct(){
        List<Product> products = productRepository.findAll();
        return ResponseEntity.ok(products.stream().map(ProductMapper::toDto).toList());
    }

    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto){
        Product product = ProductMapper.toEntity(productDto);
        ProductDto savedProduct = ProductMapper.toDto(productRepository.save(product));
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }
}
