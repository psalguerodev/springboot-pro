package com.udemy.backendninja.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Contact.
 */
@Entity
@Table(name = "contact")
public class Contact {

	/** The code. */
	@Id
	@GeneratedValue
	@Column(name = "code")
	private int code;

	/** The firstname. */
	@Column(name = "firstname")
	private String firstname;

	/** The lastname. */
	@Column(name = "lastname")
	private String lastname;

	/** The telephone. */
	@Column(name = "telephone")
	private String telephone;

	/** The city. */
	@Column(name = "city")
	private String city;

	/**
	 * Instantiates a new contact.
	 */
	public Contact() {

	}

	/**
	 * Instantiates a new contact.
	 *
	 * @param code
	 *            the code
	 * @param firstname
	 *            the firstname
	 * @param lastname
	 *            the lastname
	 * @param telephone
	 *            the telephone
	 * @param city
	 *            the city
	 */
	public Contact(int code, String firstname, String lastname, String telephone, String city) {
		super();
		this.code = code;
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.city = city;
	}

	/**
	 * Gets the firstname.
	 *
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Sets the firstname.
	 *
	 * @param firstname
	 *            the new firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * Gets the lastname.
	 *
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * Sets the lastname.
	 *
	 * @param lastname
	 *            the new lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * Gets the telephone.
	 *
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * Sets the telephone.
	 *
	 * @param telephone
	 *            the new telephone
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city
	 *            the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public int getCode() {
		return this.code;
	}

	/**
	 * Sets the code.
	 *
	 * @param code
	 *            the new code
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contact [code= " + code + "firstname=" + firstname + ", lastname=" + lastname + ", telephone="
				+ telephone + ", city=" + city + "]";
	}

}
