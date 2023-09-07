package com.myapp.spring.service;

@org.springframework.stereotype.Service() public class ProductServiceimpl
  extends java.lang.Object  implements
    com.myapp.spring.service.ProductService,    groovy.lang.GroovyObject {
;
public ProductServiceimpl
(com.myapp.spring.repository.ProductRepository repository) {}
@groovy.transform.Generated() @groovy.transform.Internal() @java.beans.Transient() public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setMetaClass(groovy.lang.MetaClass mc) { }
@java.lang.Override() public  java.util.List<com.myapp.spring.domain.Product> findAll() { return (java.util.List<com.myapp.spring.domain.Product>)null;}
@java.lang.Override() public  com.myapp.spring.domain.Product findById(java.lang.String productId) { return (com.myapp.spring.domain.Product)null;}
@java.lang.Override() public  com.myapp.spring.domain.Product saveProduct(com.myapp.spring.domain.Product product) { return (com.myapp.spring.domain.Product)null;}
@java.lang.Override() public  com.myapp.spring.domain.Product deleteProduct(java.lang.String productId) { return (com.myapp.spring.domain.Product)null;}
}
