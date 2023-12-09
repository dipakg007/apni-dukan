package com.apnidukan.controllers;


import com.apnidukan.Service.IInventoryService;
import com.apnidukan.dto.ProductDTO;
import com.apnidukan.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    //This controller deals with the Create Api calls for the product

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private IInventoryService inventoryService;

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO){
        ProductDTO savedProduct = inventoryService.createProduct(productDTO);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }
}
