package com.udemy.backendninja.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.converter.ContactConverter;
import com.udemy.backendninja.entity.Contact;
import com.udemy.backendninja.model.ContactModel;
import com.udemy.backendninja.repository.ContactRepository;
import com.udemy.backendninja.service.ContactService;


@Service("contactSeviceImpl")
public class ContactServiceImpl implements ContactService{

	@Autowired
	@Qualifier("contactRepository")
	private ContactRepository contactRepository;
	
	@Autowired
	@Qualifier("contactConverter")
	private ContactConverter contactConverter;
	
	@Override
	public ContactModel addContact(ContactModel contactModel) {
		Contact c = this.contactRepository.save(this.contactConverter.modelToEntity(contactModel));
		return this.contactConverter.entityToModel(c);
	}
	
	@Override
	public List<ContactModel> listContacts() {
		List<ContactModel> lcm = new ArrayList<ContactModel>(1);
		
		this.contactRepository.findAll().stream().forEach( c -> {
			lcm.add( this.contactConverter.entityToModel(c) );
		});
		
		return lcm;
	}

	@Override
	public Contact findByCode(int code) {
		return this.contactRepository.findByCode(code);
	}

	@Override
	public void removeContact(int code) {
		Contact c = this.findByCode(code);
		if( null != c ) {
			this.contactRepository.delete(c);
		}
	}
	
	
}
