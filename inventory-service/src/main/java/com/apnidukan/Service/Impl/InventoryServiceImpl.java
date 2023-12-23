package com.apnidukan.Service.Impl;

import com.apnidukan.Service.IInventoryService;
import com.apnidukan.dto.ProductDTO;
import com.apnidukan.entity.Product;
import com.apnidukan.mapper.ProductMapper;
import com.apnidukan.repository.InventoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements IInventoryService {

    public static final Logger LOGGER = LoggerFactory.getLogger(InventoryServiceImpl.class);

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    protected ProductMapper productMapper;

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        LOGGER.info("@@@@ ProductServiceImpl: In method createProduct to create new product");
        Product product = ProductMapper.toEntity(productDTO);
        ProductDTO savedProductDTO = ProductMapper.toDto(inventoryRepository.save(product));
        LOGGER.info("@@@@ ProductServiceImpl: Created product-> {}", productMapper.mapForLogging(savedProductDTO));
        return savedProductDTO;
    }
}
