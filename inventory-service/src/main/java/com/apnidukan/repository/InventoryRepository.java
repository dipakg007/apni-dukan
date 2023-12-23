package com.apnidukan.repository;

import com.apnidukan.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Product, Long> {
}
