package com.udemy.backendninja.model;

public class ContactModel {

	private int code;
	private String firstname;
	private String lastname;
	private String telephone;
	private String city;

	public ContactModel() {
		
	}

	public ContactModel(int code ,String firstname, String lastname, String telephone, String city) {
		super();
		this.code = code;
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.city = city;
	}

	public int getCode() {
		return this.code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "ContactModel [code= " + code + "firstname=" + firstname + ", lastname=" + lastname + ", telephone=" + telephone
				+ ", city=" + city + "]";
	}

}
