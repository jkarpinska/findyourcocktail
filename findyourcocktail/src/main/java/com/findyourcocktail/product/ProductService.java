package com.findyourcocktail.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts(){
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		
		return products;
	}
	
	public Product getProduct(String id) {
		return productRepository.findById(id).get();
	}
	
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	
	public void updateProduct(Product product) {
		productRepository.save(product);
	}
	
	public void deleteProduct(String id) {
		productRepository.delete(productRepository.findById(id).get());
	}

}
