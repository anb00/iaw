package com.iesemilidarder.anicolau.resolution.web.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iesemilidarder.anicolau.resolution.web.bean.Product;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findByName(String name);

}
