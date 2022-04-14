package com.example.pms.controller;

import com.example.pms.domain.Product;
import com.example.pms.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/products")
@RequestScope
@CrossOrigin
public class ProductRestController {

    private final ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @DeleteMapping("{productId}")

    public ResponseEntity<Product> deleteProduct(@PathVariable Long productId) {

        productService.deleteByProductId(productId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping

    public ResponseEntity<Product> getAllProduct() {
        productService.findAllProduct();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
