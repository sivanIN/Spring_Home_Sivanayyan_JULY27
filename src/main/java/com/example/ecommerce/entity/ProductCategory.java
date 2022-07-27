package com.example.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productcategory")
public class ProductCategory {
	
	@Id
	@Column(name = "categoryid")
	private Integer categoryid;
	
	@Column(name = "categoryname")
	private String categoryname;

	public ProductCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductCategory(Integer categoryid, String categoryname) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
	}

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	
	
	

}
