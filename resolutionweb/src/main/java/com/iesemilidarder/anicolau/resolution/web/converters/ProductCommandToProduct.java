package com.iesemilidarder.anicolau.resolution.web.converters;


import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.iesemilidarder.anicolau.resolution.web.command.ProductCommand;
import com.iesemilidarder.anicolau.resolution.web.bean.Product;

@Component
public class ProductCommandToProduct 
		implements Converter<ProductCommand, Product>{

  @Synchronized
  @Nullable
  @Override
  public Product convert(ProductCommand productCommand) {
    if (productCommand == null) {
      return null;
    }

    final Product product = new Product();
    product.setId(productCommand.getId());
    product.setName(productCommand.getName());
    product.setPrice(productCommand.getPrice());
    return product;
 }
}