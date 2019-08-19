package com.scanncook.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.scanncook.services.product.ProductService;
import com.scanncook.services.product.ProductServiceImpl;

@Configuration
public class ProductConfig {

	@Bean
	public ProductService newProductService() {
		return new ProductServiceImpl();
	}
}
