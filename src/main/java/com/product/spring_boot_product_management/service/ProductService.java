package com.product.spring_boot_product_management.service;

import com.product.spring_boot_product_management.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAllProducts();
}
