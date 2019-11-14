package com.mybatisGenerator.springboot.controller;

import com.mybatisGenerator.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/getProductList")
    public String getList(){
        return productService.getProduct().toString();
    }

}
