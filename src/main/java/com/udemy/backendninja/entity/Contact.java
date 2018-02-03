package com.udemy.backendninja.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {
	
	@Id
	@GeneratedValue
	@Column(name="code")
	private int code;
	
	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "city")
	private String city;

	public Contact() {

	}

	public Contact(int code ,String firstname, String lastname, String telephone, String city) {
		super();
		this.code = code;
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.city = city;
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

	public int getCode() {
		return this.code;
	}
	
	public void setCode( int code) {
		this.code = code;
	}
	
	@Override
	public String toString() {
		return "Contact [code= "+ code +"firstname=" + firstname + ", lastname=" + lastname + ", telephone=" + telephone + ", city="
				+ city + "]";
	}

}
