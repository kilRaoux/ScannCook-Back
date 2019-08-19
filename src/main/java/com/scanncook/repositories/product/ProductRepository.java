package com.scanncook.repositories.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scanncook.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	public Product findByCodebar(String codebar);
}
