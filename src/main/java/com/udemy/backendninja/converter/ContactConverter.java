package com.udemy.backendninja.converter;

import org.springframework.stereotype.Component;

import com.udemy.backendninja.entity.Contact;
import com.udemy.backendninja.model.ContactModel;

@Component("contactConverter")
public class ContactConverter {

	public Contact modelToEntity( ContactModel cm  ) {
		Contact c = new Contact();
		c.setCode(cm.getCode());
		c.setFirstname(cm.getFirstname());
		c.setCity(cm.getCity());
		c.setLastname(cm.getLastname());
		c.setTelephone(cm.getTelephone());
		return c;
	}
	
	public ContactModel entityToModel( Contact c ) {
		ContactModel cm = new ContactModel();
		cm.setCode(c.getCode());
		cm.setCity(c.getCity());
		cm.setFirstname(c.getFirstname());
		cm.setLastname(c.getLastname());
		cm.setTelephone(c.getTelephone());
		return cm;
	}
}
