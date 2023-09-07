package com.myapp.spring.service

import org.springframework.stereotype.Service
import com.myapp.spring.domain.Product
import com.myapp.spring.repository.ProductRepository


@Service
class ProductServiceimpl implements ProductService{

	private ProductRepository repository
	
	
//	Dependency injection spring will do that
	public ProductServiceimpl(ProductRepository repository) {
		this.repository = repository;
	}
	
	
	
	@Override
	public List<Product> findAll() {
		repository.findAll()
	}

	@Override
	public Product findById(String productId) {
		// TODO Auto-generated method stub
		repository.findBy(productId);
	}
	
	

	@Override
	public Product saveProduct(Product product) {
		repository.save(product)
	}

	
	
	@Override
	public Product deleteProduct(String productId) {
		// TODO Auto-generated method stub
		repository.deleteById(productId)
	}
	
	
	
}
