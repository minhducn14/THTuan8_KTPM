package com.ggduck.productservice.services;

import com.ggduck.productservice.entities.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    Product findById(Long id);
    List<Product> findAll();
    void updateStock(Long id, Integer quantity);
}
