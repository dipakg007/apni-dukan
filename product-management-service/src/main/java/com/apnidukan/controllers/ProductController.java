package com.apnidukan.controllers;

import com.apnidukan.dto.ProductDTO;
import com.apnidukan.entity.Product;
import com.apnidukan.mapper.ProductMapper;
import com.apnidukan.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {


    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProduct(){
        List<Product> products = productRepository.findAll();
        return ResponseEntity.ok(products.stream().map(ProductMapper::toDto).toList());
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDto){
        Product product = ProductMapper.toEntity(productDto);
        ProductDTO savedProduct = ProductMapper.toDto(productRepository.save(product));
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }
}
