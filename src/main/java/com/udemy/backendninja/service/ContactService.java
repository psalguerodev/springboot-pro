package com.udemy.backendninja.service;

import java.util.List;

import com.udemy.backendninja.entity.Contact;
import com.udemy.backendninja.model.ContactModel;

public interface ContactService {

	public abstract ContactModel addContact( ContactModel contactModel );
	
	public abstract List<ContactModel> listContacts();
	
	public abstract Contact findByCode( int code );
	
	public abstract void removeContact( int code);
	
	public abstract ContactModel findModelByCode( int code );
}
