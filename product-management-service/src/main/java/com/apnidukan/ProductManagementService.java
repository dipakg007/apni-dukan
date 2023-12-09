package com.apnidukan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.apnidukan.mapper")
public class ProductManagementService {
    public static void main(String[] args) {
        SpringApplication.run(ProductManagementService.class);
    }
}