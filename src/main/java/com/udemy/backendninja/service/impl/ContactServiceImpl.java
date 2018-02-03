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


// TODO: Auto-generated Javadoc
/**
 * The Class ContactServiceImpl.
 */
@Service("contactSeviceImpl")
public class ContactServiceImpl implements ContactService{

	/** The contact repository. */
	@Autowired
	@Qualifier("contactRepository")
	private ContactRepository contactRepository;
	
	/** The contact converter. */
	@Autowired
	@Qualifier("contactConverter")
	private ContactConverter contactConverter;
	
	/* (non-Javadoc)
	 * @see com.udemy.backendninja.service.ContactService#addContact(com.udemy.backendninja.model.ContactModel)
	 */
	@Override
	public ContactModel addContact(ContactModel contactModel) {
		Contact c = this.contactRepository.save(this.contactConverter.modelToEntity(contactModel));
		return this.contactConverter.entityToModel(c);
	}
	
	/* (non-Javadoc)
	 * @see com.udemy.backendninja.service.ContactService#listContacts()
	 */
	@Override
	public List<ContactModel> listContacts() {
		List<ContactModel> lcm = new ArrayList<ContactModel>(1);
		
		this.contactRepository.findAll().stream().forEach( c -> {
			lcm.add( this.contactConverter.entityToModel(c) );
		});
		
		return lcm;
	}

	/* (non-Javadoc)
	 * @see com.udemy.backendninja.service.ContactService#findByCode(int)
	 */
	@Override
	public Contact findByCode(int code) {
		return this.contactRepository.findByCode(code);
	}
	
	/* (non-Javadoc)
	 * @see com.udemy.backendninja.service.ContactService#findModelByCode(int)
	 */
	@Override
	public ContactModel findModelByCode(int code) {
		return this.contactConverter.entityToModel(this.findByCode(code));
	}

	/* (non-Javadoc)
	 * @see com.udemy.backendninja.service.ContactService#removeContact(int)
	 */
	@Override
	public void removeContact(int code) {
		Contact c = this.findByCode(code);
		if( null != c ) {
			this.contactRepository.delete(c);
		}
	}
	
	
}
