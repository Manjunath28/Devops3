package com.myapp.spring.repository;

public interface ProductRepository
  extends
    org.springframework.data.mongodb.repository.MongoRepository<com.myapp.spring.domain.Product, java.lang.String> {
}
