package com.example.ecommerce.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.entity.Product;
import com.example.ecommerce.productdao.ProductDAOImpl;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDAOImpl productDAOImpl;


	public List<Product> findAll() {
		
		return productDAOImpl.findAll();
	}

    
	
	public void saveOrUpdate(Product p) {
		System.out.println("test");
		productDAOImpl.saveOrUpdate(p);
		
	}


	
	public void deleteById(int prodId) {
		productDAOImpl.deleteById(prodId);
		
	}


	@Override
	public Product findById(int prodId) {
		
		return productDAOImpl.findById(prodId);
	}


	
	
//	@Transactional
//	public void deleteById(int prodId) {
//		productDAOImpl.deleteById(prodId);
//		
//	}

}
