package com.Infosys.productapp.controller;

import com.Infosys.productapp.dto.ProductDto;
import com.Infosys.productapp.entity.ProductEntity;
import com.Infosys.productapp.service.IProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final Logger log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private IProductService productService;

    @PostMapping("/product")
    public ProductEntity createProduct(@RequestBody ProductDto productDto){
        log.info("-- createProduct() --");
       ProductEntity savedProduct =  productService.createProduct(productDto);
       return savedProduct;
    }

    @GetMapping("/product")
    public List<ProductEntity> getAllProducts(){
        log.info("-- This method invoked -> getAllProducts() --");
        return productService.getAllProduct();
    }

    @GetMapping("/product/{id}")
    public ProductDto getProductById(@PathVariable("id") String productId){
        log.info("-- This method invoked -> getProductById() --");
        return productService.getProductById(productId);
    }
    @DeleteMapping("product/{id}")
    public void  deleteById(@PathVariable("id") String productId){
        log.info("--This method will start deleting -> deleteById()--");
        productService.deleteById(productId);
    }



    @PostMapping("/products")
    public  List<ProductDto> createMultipleProduct(@RequestBody List<ProductDto> productDtoList){
        log.info("-- createProduct() --");
        List<ProductDto> list =  productService.createMultipleProduct(productDtoList);
        return list;
    }


}









/*
* C. Create - PoSt
* R. Read -  GET
* U. Update - PUt
* D.  Delete - Delete
* */