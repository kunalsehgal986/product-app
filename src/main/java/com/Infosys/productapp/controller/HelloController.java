package com.Infosys.productapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
}

/*
I want to create a Product
No database
ProductController
IProductService
ProductServiceImpl - impl
ProductRepository
ProductDto - dto
*/
