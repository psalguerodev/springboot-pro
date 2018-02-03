package com.udemy.backendninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemy.backendninja.constants.ViewsConstants;
import com.udemy.backendninja.model.ContactModel;

@Controller
@RequestMapping("/contact")
public class ContactController {

	public static final Log LOG = LogFactory.getLog(ContactController.class);
	
	@GetMapping("/")
	public String index() {
		return "redirect:/contact/list";
	}
	
	@GetMapping("/list")
	public String showListContacts() {
		LOG.info("Call showListContacts()");
		return ViewsConstants.vcontact;
	}
	
	@GetMapping("/form")
	public String showFormContact(Model model) {
		LOG.info("Call showFormContact(Model model)");
		model.addAttribute("contactModel", new ContactModel());
		return ViewsConstants.vcontactForm;
	}
	
	@PostMapping("/add")
	public String addContact(Model model ,
			@ModelAttribute(name="contactModel") ContactModel contactModel) {
		LOG.info("Call addContact(contactModel) --> " + contactModel.toString() );
		model.addAttribute("result", 1);
		return ViewsConstants.vcontact; 
	}
	
}
