package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.entity.Product;
import com.example.ecommerce.entity.ProductCategory;
import com.example.ecommerce.service.ProductCategoryService;
import com.example.ecommerce.service.ProductService;

@RestController
@RequestMapping("/App")
public class Ecommercecontroller {

	@Autowired
	ProductService productService;

	@Autowired
	ProductCategoryService productCategoryService;

	@GetMapping("/products")
	public List<Product> findAllProducts(){
		return productService.findAll();
	}
	
	@GetMapping("/product/{prodId}")
	public Product productById(@PathVariable int prodId) throws Exception {
		Product product = productService.findById(prodId);
		
		if (product == null)
			throw new Exception("product ID : " + prodId + " details not available in Repository..");

		return product;
		
		
	}

	@PostMapping("/saveproduct")
	public String saveProduct(@RequestBody Product p) {

		productService.saveOrUpdate(p);
		return "product with id " + p.getId() + " is Added successfully";
	}
	
	@PutMapping  ("/updateProduct")
	public String updateProduct(@RequestBody Product p) {

		productService.saveOrUpdate(p);
		return "product with id " + p.getId() + " is updated successfully";
	}
	
	@DeleteMapping("/prod/{prodId}")
	public String  removeProductById(@PathVariable int prodId) {
		
		productService.deleteById(prodId);
		
		return "Product with id " + prodId + " deleted successfully";
		
	}
	
//	Category

	@GetMapping("/categories")
	public List<ProductCategory> findAllCategory(){
		return productCategoryService.findAll();
	}
	
	@GetMapping("/category/{catId}")
	public ProductCategory CategoryById(@PathVariable int catId) throws Exception {
		ProductCategory productCategory = productCategoryService.findById(catId);
		
		if (productCategory == null)
			throw new Exception("Category ID : " + catId + " details not available in Repository..");

		return productCategory;
		
		}
	
	
	@PostMapping("/savecategory")
	public String saveCategory(@RequestBody ProductCategory pc) {

		productCategoryService.saveOrUpdate(pc);
		return "category with id " + pc.getCategoryid() + " is Added successfully";
	}
	
	@PutMapping  ("/updateCategory")
	public String updateProductCategory(@RequestBody ProductCategory pc) {

		productCategoryService.saveOrUpdate(pc);
		return "Category with id " + pc.getCategoryid()+ " is updated successfully";
	}
	
	@DeleteMapping("/productcategory/{catId}")
	public String  removeCategoryById(@PathVariable int catId) {
		
		productCategoryService.deleteById(catId);
		
		return "Product Category with id " + catId + " deleted successfully";
		
	}


}
