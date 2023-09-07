package com.myapp.spring.service;

public interface ProductService
 {
 java.util.List<com.myapp.spring.domain.Product> findAll();
 com.myapp.spring.domain.Product findById(java.lang.String productId);
 com.myapp.spring.domain.Product saveProduct(com.myapp.spring.domain.Product product);
 com.myapp.spring.domain.Product deleteProduct(java.lang.String productId);
}
