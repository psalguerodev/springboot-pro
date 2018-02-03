package com.udemy.backendninja.service;

import java.util.List;

import com.udemy.backendninja.model.ContactModel;

public interface ContactService {

	public abstract ContactModel addContact( ContactModel contactModel );
	
	public abstract List<ContactModel> listContacts();
}
