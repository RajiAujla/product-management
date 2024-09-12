package com.product.spring_boot_product_management.repository;

import com.product.spring_boot_product_management.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
