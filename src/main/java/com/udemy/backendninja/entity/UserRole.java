package com.udemy.backendninja.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

// TODO: Auto-generated Javadoc
/**
 * The Class UserRole.
 */
@Entity
@Table(name = "user_role", uniqueConstraints = @UniqueConstraint(columnNames = { "role", "username" }))
public class UserRole {

	/** The user role id. */
	@Id
	@GeneratedValue
	@Column(name = "user_role_id", unique = true, nullable = false)
	private Integer userRoleId;

	/** The user. */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "username", nullable = false)
	private User user;

	/** The role. */
	@Column(name = "role", nullable = false, length = 45)
	private String role;

	/**
	 * Instantiates a new user role.
	 */
	public UserRole() {

	}

	/**
	 * Instantiates a new user role.
	 *
	 * @param userRoleId
	 *            the user role id
	 * @param user
	 *            the user
	 * @param role
	 *            the role
	 */
	public UserRole(Integer userRoleId, User user, String role) {
		super();
		this.userRoleId = userRoleId;
		this.user = user;
		this.role = role;
	}

	/**
	 * Gets the user role id.
	 *
	 * @return the user role id
	 */
	public Integer getUserRoleId() {
		return userRoleId;
	}

	/**
	 * Sets the user role id.
	 *
	 * @param userRoleId
	 *            the new user role id
	 */
	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Sets the user.
	 *
	 * @param user
	 *            the new user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Sets the role.
	 *
	 * @param role
	 *            the new role
	 */
	public void setRole(String role) {
		this.role = role;
	}

}
