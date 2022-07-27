package com.example.ecommerce.productdao;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.example.ecommerce.entity.ProductCategory;

@Repository
public interface ProductCategoryDAO {
	
	List<ProductCategory> findAll();
	public ProductCategory findById(int catId);
	public void saveOrUpdate(ProductCategory pc);
	public void deleteById(int catId);

}
