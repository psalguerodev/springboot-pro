package com.udemy.backendninja.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.converter.ProductConverter;
import com.udemy.backendninja.entity.Product;
import com.udemy.backendninja.model.ProductModel;
import com.udemy.backendninja.repository.ProductRepository;
import com.udemy.backendninja.service.ProductService;

@Service("productServiceImpl")
public class ProductServiceImpl implements ProductService{

	@Autowired
	@Qualifier("contactRepository")
	private ProductRepository productRpository;
	
	@Autowired
	@Qualifier("productConverter")
	private ProductConverter productConverter;
	
	@Override
	public ProductModel addProduct(ProductModel prd) {
		Product c = this.productRpository.save(this.productConverter.modelToEntity(prd));
		return this.productConverter.entityToModel(c);
	}

	@Override
	public List<ProductModel> listProducts() {
		List<ProductModel> prdList = new ArrayList<ProductModel>(3);
		
		this.productRpository.findAll().stream().forEach( p -> {
			prdList.add( this.productConverter.entityToModel(p) );
		});
		return prdList;
	}

	@Override
	public Product findByCode(Integer code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeProduct(Integer code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductModel findModelByCode(Integer code) {
		// TODO Auto-generated method stub
		return null;
	}

}
