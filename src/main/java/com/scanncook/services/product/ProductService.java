package com.scanncook.services.product;

import java.util.List;

import com.scanncook.models.Product;

public interface ProductService {

	public List<Product> findAll();
	public void save(Product entity);
	public void delete(Product entity);
	public void update(Product entity);
}
