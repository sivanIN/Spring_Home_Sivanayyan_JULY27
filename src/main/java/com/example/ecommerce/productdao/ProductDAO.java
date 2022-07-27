package com.example.ecommerce.productdao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.ecommerce.entity.Product;

@Repository
public interface ProductDAO {

	List<Product> findAll();
	public Product findById(int prodId);
	
	public void saveOrUpdate(Product p);
	public void deleteById(int prodId);
	
}
