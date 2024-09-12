package com.product.spring_boot_product_management.service;

import com.product.spring_boot_product_management.model.Product;
import com.product.spring_boot_product_management.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product){
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }
}
