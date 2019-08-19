package com.scanncook.services.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.scanncook.models.Product;
import com.scanncook.repositories.product.ProductRepository;

public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public void save(Product entity) {
		productRepository.save(entity);	
	}

	@Override
	public void delete(Product entity) {
		productRepository.delete(entity);
	}

	@Override
	public void update(Product entity) {
		productRepository.delete(entity);
		productRepository.save(entity);
	}

}
