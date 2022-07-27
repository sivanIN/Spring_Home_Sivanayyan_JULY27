package com.example.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.ecommerce.entity.ProductCategory;

@Service
public interface ProductCategoryService {
	
	List<ProductCategory> findAll();
	public ProductCategory findById(int catId);
	public void saveOrUpdate(ProductCategory pc);
	public void deleteById(int catId);

}
