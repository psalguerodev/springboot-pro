package com.udemy.backendninja.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name="code")
	private long code;
	
	@Column(name="name" , nullable=false , length=60)
	private String name;
	
	@Column(name="description", nullable=false)
	private String description;
	
	@Column(name="price" , nullable=false)
	private Double price; 
	
	@Column(name="cant" , nullable=false)
	private Integer cant;
	
	public Product() {
		
	}

	public Product(long code, String name, String description, Double price, Integer cant) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.price = price;
		this.cant = cant;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getCant() {
		return cant;
	}

	public void setCant(Integer cant) {
		this.cant = cant;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", cant=" + cant + "]";
	}
	
	
	
}
