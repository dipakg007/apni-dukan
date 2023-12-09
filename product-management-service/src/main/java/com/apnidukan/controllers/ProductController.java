package com.apnidukan.controllers;

import com.apnidukan.Service.IProductService;
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

    //This controller deals with the Get Api calls for the product

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private IProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProduct(){
        List<ProductDTO> products = productService.getAllProduct();
        return ResponseEntity.ok(products);
    }
}
