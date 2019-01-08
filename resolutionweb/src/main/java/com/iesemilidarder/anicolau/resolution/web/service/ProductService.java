package com.iesemilidarder.anicolau.resolution.web.service;

import java.util.List;
import java.util.Optional;

import com.iesemilidarder.anicolau.resolution.web.command.ProductCommand;
import com.iesemilidarder.anicolau.resolution.web.bean.Product;

public interface ProductService {
	public Product getById(Long id);
	public List<Product> getProducts();
	public ProductCommand saveProduct(ProductCommand productCommand);
}
