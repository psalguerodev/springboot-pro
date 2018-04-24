package com.udemy.backendninja.model;

public class ProductModel {

	private long id;

	private String name;

	private String description;

	private Double price;

	private Integer cant;

	public ProductModel() {

	}

	public ProductModel(long id, String name, String description, Double price, Integer cant) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.cant = cant;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
		return "ProductModel [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", cant=" + cant + "]";
	}

}
