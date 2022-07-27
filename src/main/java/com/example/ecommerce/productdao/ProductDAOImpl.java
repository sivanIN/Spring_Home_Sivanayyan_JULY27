package com.example.ecommerce.productdao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	EntityManager entitymanager;


	public List<Product> findAll() {
		Session currentsession = entitymanager.unwrap(Session.class);
		Query<Product> query = 	currentsession.createQuery("select p from Product p",Product.class)	;
		List<Product> products = query.getResultList();
		return products;
	}


	@Transactional
	public void saveOrUpdate(Product p) {
		System.out.println("test2");
		Session curretnsession = entitymanager.unwrap(Session.class);
		curretnsession.saveOrUpdate(p);
		System.out.println("test2");
		
	}


	@Transactional
	public void deleteById(int prodId) {
		
		Session currentSession  = entitymanager.unwrap(Session.class);
		Query<Product> query = currentSession.createQuery("delete from Product where id = :productId");
		query.setParameter("productId",prodId );
		query.executeUpdate();

		
	}


	@Override
	public Product findById(int prodId) {
		
		Session currentSession  = entitymanager.unwrap(Session.class);
		Product product = currentSession.get(Product.class, prodId);

		return product;
	}

	
	

}
