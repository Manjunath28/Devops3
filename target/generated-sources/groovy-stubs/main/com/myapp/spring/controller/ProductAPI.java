package com.myapp.spring.controller;

@org.springframework.web.bind.annotation.RestController() @org.springframework.web.bind.annotation.RequestMapping(value="/api/products") public class ProductAPI
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
;
public ProductAPI
(com.myapp.spring.service.ProductService ProductService) {}
@groovy.transform.Generated() @groovy.transform.Internal() @java.beans.Transient() public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setMetaClass(groovy.lang.MetaClass mc) { }
@org.springframework.web.bind.annotation.GetMapping() public  java.lang.Object getAllProductList() { return (java.lang.Object)null;}
@org.springframework.web.bind.annotation.PostMapping() public  com.myapp.spring.domain.Product saveProduct(@org.springframework.web.bind.annotation.RequestBody() com.myapp.spring.domain.Product product) { return (com.myapp.spring.domain.Product)null;}
@org.springframework.web.bind.annotation.PutMapping(value="/{productId}") public  com.myapp.spring.domain.Product updateProduct(@org.springframework.web.bind.annotation.PathVariable() java.lang.String productId, @org.springframework.web.bind.annotation.RequestBody() com.myapp.spring.domain.Product product) { return (com.myapp.spring.domain.Product)null;}
@org.springframework.web.bind.annotation.DeleteMapping(value="/{productId}") public  java.lang.Object deleteProduct(@org.springframework.web.bind.annotation.PathVariable() java.lang.String productId) { return (java.lang.Object)null;}
@org.springframework.web.bind.annotation.GetMapping(value="/{productId}") public  com.myapp.spring.domain.Product getProductById(@org.springframework.web.bind.annotation.PathVariable() java.lang.String productId) { return (com.myapp.spring.domain.Product)null;}
}
