package com.udemy.backendninja.model;

// TODO: Auto-generated Javadoc
/**
 * The Class UserCredencial.
 */
public class UserCredencial {

	/** The username. */
	private String username;
	
	/** The password. */
	private String password;

	/**
	 * Instantiates a new user credencial.
	 */
	public UserCredencial() {

	}

	/**
	 * Instantiates a new user credencial.
	 *
	 * @param username the username
	 * @param password the password
	 */
	public UserCredencial(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserCredencial [username=" + username + ", password=" + password + "]";
	}

}
