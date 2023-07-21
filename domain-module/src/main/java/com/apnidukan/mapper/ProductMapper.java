package com.apnidukan.mapper;

import com.apnidukan.dto.ProductDto;
import com.apnidukan.entity.Product;

public class ProductMapper {

    public static Product toEntity(ProductDto productDto){
        Product product = new Product();
        product.setId(productDto.getId());
        product.setTitle(productDto.getTitle());
        return product;
    }

    public static ProductDto toDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setTitle(product.getTitle());
        return productDto;
    }
}
