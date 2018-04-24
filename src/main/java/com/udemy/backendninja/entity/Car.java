package com.udemy.backendninja.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name = "car")
public class Car {

	@Id
	@GeneratedValue
	@Column(name="code")
	private long code;
	
	@Column(name="model", nullable=false , length= 50)
	private String model;
	
	@Column(name="year", nullable=false , length=4)
	@Min(1900)
	private int year;
	
	@Column(name="description" )
	private String description;
	
	@Column(name="price", nullable=false)
	private double price;

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Car(long code, String model, int year, String description, double price) {
		super();
		this.code = code;
		this.model = model;
		this.year = year;
		this.description = description;
		this.price = price;
	}

	public Car() {

	}

	@Override
	public String toString() {
		return "Car [code=" + code + ", model=" + model + ", year=" + year + ", description=" + description + ", price="
				+ price + "]";
	}

}
