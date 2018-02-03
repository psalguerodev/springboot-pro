package com.udemy.backendninja.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Log.
 */
@Entity
@Table(name = "log")
public class Log {

	/** The id. */
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	/** The date. */
	@Column(name = "date")
	private Date date;

	/** The details. */
	@Column(name = "details")
	private String details;

	/** The username. */
	@Column(name = "username")
	private String username;

	/** The url. */
	@Column(name = "url")
	private String url;

	/**
	 * Instantiates a new log.
	 */
	public Log() {

	}

	/**
	 * Instantiates a new log.
	 *
	 * @param id
	 *            the id
	 * @param date
	 *            the date
	 * @param details
	 *            the details
	 * @param username
	 *            the username
	 * @param url
	 *            the url
	 */
	public Log(int id, Date date, String details, String username, String url) {
		super();
		this.id = id;
		this.date = date;
		this.details = details;
		this.username = username;
		this.url = url;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date
	 *            the new date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Gets the details.
	 *
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * Sets the details.
	 *
	 * @param details
	 *            the new details
	 */
	public void setDetails(String details) {
		this.details = details;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username
	 *            the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the url.
	 *
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the url.
	 *
	 * @param url
	 *            the new url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}
