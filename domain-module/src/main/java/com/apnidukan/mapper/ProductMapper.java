package com.apnidukan.mapper;

import com.apnidukan.Enums.ProductEnum;
import com.apnidukan.dto.ProductDTO;
import com.apnidukan.entity.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductMapper {

    public static final Logger LOGGER = LoggerFactory.getLogger(ProductMapper.class);

    public static Product toEntity(ProductDTO productDto){
        LOGGER.info("@@@@ ProductMapper: In method toEntity to map DTO to Entity");
        Product product = new Product();
        product.setId(productDto.getId());
        product.setTitle(productDto.getTitle());
        return product;
    }

    public static ProductDTO toDto(Product product){
        LOGGER.info("@@@@ ProductMapper: In method toDTO to map Entity to DTO");
        ProductDTO productDto = new ProductDTO();
        productDto.setId(product.getId());
        productDto.setTitle(product.getTitle());
        return productDto;
    }

    public String mapForLogging(ProductDTO productDTO){
        String productString = "";
        return productString.concat(ProductEnum.ID.name()).concat(" = ").concat(productDTO.getId().toString())
                .concat(", ").concat(ProductEnum.TITLE.name()).concat(" = ").concat(productDTO.getTitle());
    }
}
