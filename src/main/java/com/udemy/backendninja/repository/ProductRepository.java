package com.udemy.backendninja.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backendninja.entity.Product;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Serializable>{
	
	public abstract Product findByCode(int code);
	
}
