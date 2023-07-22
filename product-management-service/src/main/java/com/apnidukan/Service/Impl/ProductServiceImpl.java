package com.apnidukan.Service.Impl;

import com.apnidukan.Service.IProductService;
import com.apnidukan.dto.ProductDTO;
import com.apnidukan.entity.Product;
import com.apnidukan.mapper.ProductMapper;
import com.apnidukan.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    public static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    protected ProductMapper productMapper;

    @Override
    public List<ProductDTO> getAllProduct() {
        LOGGER.info("@@@@ ProductServiceImpl: In method getAllProducts to fetch all the products");
        List<Product> product = productRepository.findAll();
        return product.stream().map(ProductMapper::toDto).toList();
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        LOGGER.info("@@@@ ProductServiceImpl: In method createProduct to create new product");
        Product product = ProductMapper.toEntity(productDTO);
        ProductDTO savedProductDTO = ProductMapper.toDto(productRepository.save(product));
        LOGGER.info("@@@@ ProductServiceImpl: Created product-> {}", productMapper.mapForLogging(savedProductDTO));
        return savedProductDTO;
    }
}
