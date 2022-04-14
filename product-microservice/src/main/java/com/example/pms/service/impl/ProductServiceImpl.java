package com.example.pms.service.impl;

import com.example.pms.domain.Product;
import com.example.pms.repository.ProductRepository;
import com.example.pms.service.ProductService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        product.setCreatedDate(LocalDateTime.now());
        return productRepository.save(product);
    }

    @Override
    public void deleteByProductId(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }


}
