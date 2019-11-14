package com.mybatisGenerator.springboot.service;

import com.mybatisGenerator.springboot.Dao.ProductMapper;
import com.mybatisGenerator.springboot.Entry.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    public List<Product> getProduct(){
        List<Product> list=null;
        list= productMapper.selectAll();
        return list;

    }
}
