package com.udemy.backendninja.service;

import java.util.List;

import com.udemy.backendninja.entity.Contact;
import com.udemy.backendninja.model.ContactModel;

// TODO: Auto-generated Javadoc
/**
 * The Interface ContactService.
 */
public interface ContactService {

	/**
	 * Adds the contact.
	 *
	 * @param contactModel the contact model
	 * @return the contact model
	 */
	public abstract ContactModel addContact( ContactModel contactModel );
	
	/**
	 * List contacts.
	 *
	 * @return the list
	 */
	public abstract List<ContactModel> listContacts();
	
	/**
	 * Find by code.
	 *
	 * @param code the code
	 * @return the contact
	 */
	public abstract Contact findByCode( int code );
	
	/**
	 * Removes the contact.
	 *
	 * @param code the code
	 */
	public abstract void removeContact( int code);
	
	/**
	 * Find model by code.
	 *
	 * @param code the code
	 * @return the contact model
	 */
	public abstract ContactModel findModelByCode( int code );
}
