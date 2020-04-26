package com.Infosys.productapp.service.impl;

import com.Infosys.productapp.controller.ProductController;
import com.Infosys.productapp.dto.ProductDto;
import com.Infosys.productapp.entity.ProductEntity;
import com.Infosys.productapp.repository.ProductRepository;
import com.Infosys.productapp.service.IProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements IProductService {

    private final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    ProductRepository productRepository;


    private static Map<String, ProductDto> productMap = new HashMap<>();

    @Override
    public ProductEntity createProduct(ProductDto productDto) {
       /* productMap.put(productDto.getId(), productDto);
        log.info("Size of Map is {}, and id is {}", productMap.size(), productDto.getId());*/

        ProductEntity productEntity  = new ProductEntity();
        productEntity.setProductName(productDto.getName());
        productEntity.setDescription(productDto.getDescription());
        productEntity=  productRepository.save(productEntity);

        return productEntity;
    }

    @Override
    public  List<ProductEntity> getAllProduct() {

       /* List<ProductDto> productList = new ArrayList<>();
        productMap.forEach((id, productDto) -> {
            productList.add(productDto);
        });

        return productList;*/

      return productRepository.findAll();
    }

    @Override
    public ProductDto getProductById(String productId) {
        return productMap.get(productId);



    }

    @Override
    public void deleteById(String productId) {
         productMap.remove(productId);
    }

    @Override
    public List<ProductDto> createMultipleProduct(List<ProductDto> productDtoList) {
       /* for(ProductDto dto : productDtoList){
            productMap.put(dto.getId(), dto);
        }*/

       productDtoList.forEach(productDto -> productMap.put(productDto.getId(), productDto));
        return  productDtoList;
    }
}
