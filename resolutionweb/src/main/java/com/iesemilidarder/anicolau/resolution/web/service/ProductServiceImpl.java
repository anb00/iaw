package com.iesemilidarder.anicolau.resolution.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.iesemilidarder.anicolau.resolution.web.command.ProductCommand;
import com.iesemilidarder.anicolau.resolution.web.converters.ProductCommandToProduct;
import com.iesemilidarder.anicolau.resolution.web.converters.ProductToProductCommand;
import com.iesemilidarder.anicolau.resolution.web.bean.Product;
import com.iesemilidarder.anicolau.resolution.web.exceptions.ProductNotFoundException;
import com.iesemilidarder.anicolau.resolution.web.service.ProductRepository;
import com.iesemilidarder.anicolau.resolution.web.service.ProductService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

  private ProductRepository productRepository;
  private ProductToProductCommand productToProductCommand;
  private ProductCommandToProduct productCommandToProduct;
  
  
  
  public ProductServiceImpl(ProductRepository productRepository, 
      ProductToProductCommand productToProductCommand,
      ProductCommandToProduct productCommandToProduct) {
    this.productRepository = productRepository;
    this.productToProductCommand = productToProductCommand;
    this.productCommandToProduct = productCommandToProduct;
  }

  @Override
  public Product getById(Long id) {
    Optional<Product> product = productRepository.findById(id);
    
     if (!product.isPresent()) {
        throw new ProductNotFoundException("Product not found: " + id );
     }
     
    return product.get();
  }
  
  @Override
  public List<Product> getProducts() {
    return (List<Product>)productRepository.findAll();
  }

  @Override
  public ProductCommand saveProduct(ProductCommand productCommand){
    Product product = productCommandToProduct.convert(productCommand);
    Product savedProduct = productRepository.save(product);
    
    return productToProductCommand.convert(savedProduct);
  }

}
