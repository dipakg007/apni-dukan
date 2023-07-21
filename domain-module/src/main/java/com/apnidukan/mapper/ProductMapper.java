package com.apnidukan.mapper;

import com.apnidukan.dto.ProductDTO;
import com.apnidukan.entity.Product;

public class ProductMapper {

    public static Product toEntity(ProductDTO productDto){
        Product product = new Product();
        product.setId(productDto.getId());
        product.setTitle(productDto.getTitle());
        return product;
    }

    public static ProductDTO toDto(Product product){
        ProductDTO productDto = new ProductDTO();
        productDto.setId(product.getId());
        productDto.setTitle(product.getTitle());
        return productDto;
    }
}
