package com.scanncook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scanncook.models.Ingredient;
import com.scanncook.models.Product;
import com.scanncook.services.product.ProductService;

@RestController
@RequestMapping("products")
@CrossOrigin
public class ProductController {
	
	@Autowired
	public ProductService productService;
	
	@GetMapping("")
	public List<Product> findAll(){
		return productService.findAll();
	}

	@PostMapping("")
	public void save(@RequestBody Product entity) {
		productService.save(entity);
	}
	
	@DeleteMapping("")
	public void delete(@RequestBody Product entity) {
		productService.delete(entity);
	}
	
	@PutMapping("")
	public void update(@RequestBody Product entity) {
		productService.update(entity);
	}
}
	
