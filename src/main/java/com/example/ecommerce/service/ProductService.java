package com.example.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ecommerce.entity.Product;

@Service
public interface ProductService {
	
	List<Product> findAll();
	
	public Product findById(int prodId);
	
	public void saveOrUpdate(Product p);
	
	public void deleteById(int prodId);

}
