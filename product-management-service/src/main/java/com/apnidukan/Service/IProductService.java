package com.apnidukan.Service;

import com.apnidukan.dto.ProductDTO;

import java.util.List;

public interface IProductService {
    List<ProductDTO> getAllProduct();

    ProductDTO createProduct(ProductDTO productDTO);
}
