package com.udemy.backendninja.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemy.backendninja.entity.Contact;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
	
	@GetMapping("/checkrest")
	public ResponseEntity<Contact> checkRest(){
		Contact c = new Contact();
		c.setCity("Lima");
		c.setFirstname("Patrick");
		c.setLastname("Salguero");
		c.setTelephone("954323934");
		c.setCode(1);
		return new ResponseEntity<Contact>( c ,HttpStatus.ACCEPTED);
	}
	
}
