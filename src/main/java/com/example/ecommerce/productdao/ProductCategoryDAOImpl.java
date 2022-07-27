package com.example.ecommerce.productdao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.entity.ProductCategory;

@Repository
public class ProductCategoryDAOImpl  implements ProductCategoryDAO{
	
	@Autowired
	EntityManager entityManager;

	@Override
	public List<ProductCategory> findAll() {
		Session currentsession = entityManager.unwrap(Session.class);
		Query<ProductCategory> query = currentsession.createQuery("select c from ProductCategory c",ProductCategory.class);
		List<ProductCategory> productcategories = query.getResultList();
		return productcategories;
	}

	@Override
	public ProductCategory findById(int catId) {
		Session currentsession = entityManager.unwrap(Session.class);
		ProductCategory productCategory = currentsession.get(ProductCategory.class, catId);
		return productCategory;
	}

	@Transactional
	public void saveOrUpdate(ProductCategory pc) {
		
		Session currentsession = entityManager.unwrap(Session.class);
		currentsession.saveOrUpdate(pc);
		
	}

	@Transactional
	public void deleteById(int catId) {
		Session currentsession = entityManager.unwrap(Session.class);
		Query<ProductCategory> query = currentsession.createQuery("delete from ProductCategory where categoryid= :catid");
		query.setParameter("catid", catId);
		query.executeUpdate();
		
	}

}
