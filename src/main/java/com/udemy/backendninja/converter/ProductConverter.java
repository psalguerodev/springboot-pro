package com.udemy.backendninja.converter;

import org.springframework.stereotype.Component;

import com.udemy.backendninja.entity.Product;
import com.udemy.backendninja.model.ProductModel;

@Component("productConverter")
public class ProductConverter {
	
	public Product modelToEntity( ProductModel cm ) {
		Product p = new Product();
		p.setCode(cm.getId() );
		p.setDescription(cm.getDescription());
		p.setName(cm.getName());
		p.setPrice(cm.getPrice());
		return p;
	}
	
	public ProductModel entityToModel( Product prd ) {
		ProductModel pm = new ProductModel();
		pm.setDescription(prd.getDescription());
		pm.setId(prd.getCode());
		pm.setName(prd.getName());
		pm.setPrice(prd.getPrice());
		return pm;
	}
	
	
}
