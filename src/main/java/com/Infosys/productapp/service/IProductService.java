package com.Infosys.productapp.service;

import com.Infosys.productapp.dto.ProductDto;
import com.Infosys.productapp.entity.ProductEntity;

import java.util.List;

public interface IProductService {
    ProductEntity createProduct(ProductDto productDto);

    List<ProductEntity> getAllProduct();

    ProductDto getProductById(String productId);

    void deleteById(String productId);

    List<ProductDto> createMultipleProduct(List<ProductDto> productDtoList);
}
