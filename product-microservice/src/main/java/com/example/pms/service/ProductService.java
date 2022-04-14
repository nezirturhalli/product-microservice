package com.example.pms.service;

import com.example.pms.domain.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    void deleteByProductId(Long id);

    List<Product> findAllProduct();
}
