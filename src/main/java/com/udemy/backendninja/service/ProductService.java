package com.udemy.backendninja.service;

import java.util.List;

import com.udemy.backendninja.entity.Product;
import com.udemy.backendninja.model.ProductModel;

public interface ProductService {

	public abstract ProductModel addProduct( ProductModel prd );
	
	public abstract List<ProductModel> listProducts();
	
	public abstract Product findByCode(Integer code);
	
	public abstract void removeProduct(Integer code);
	
	public abstract ProductModel findModelByCode(Integer code);
	
}
