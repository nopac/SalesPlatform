package com.example.springboot.service;

import com.example.springboot.model.Product;

import java.util.List;

public interface ProductService {
    Object selectAllProduct(int currPage, int pageSize);
    Object selectProductByType(int currPage, int pageSize, String type);
    Product selectById(Integer id);
    List<Product> selectByName(String name);
    Object selectComment(int currPage, int pageSize, Integer productId);
}
