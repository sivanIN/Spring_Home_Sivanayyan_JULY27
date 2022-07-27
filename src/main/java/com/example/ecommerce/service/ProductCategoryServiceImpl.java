package com.example.ecommerce.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.entity.ProductCategory;
import com.example.ecommerce.productdao.ProductCategoryDAOImpl;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{
	
	@Autowired
	ProductCategoryDAOImpl productCategoryDAOImpl;

	@Override
	public List<ProductCategory> findAll() {
		
		return productCategoryDAOImpl.findAll();
	}

	@Override
	public ProductCategory findById(int catId) {
		
		return productCategoryDAOImpl.findById(catId);
	}

	
	public void saveOrUpdate(ProductCategory pc) {
		productCategoryDAOImpl.saveOrUpdate(pc);
		
	}

	
	public void deleteById(int catId) {
		productCategoryDAOImpl.deleteById(catId);
		
	}

}
