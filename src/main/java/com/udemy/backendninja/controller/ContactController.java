package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemy.backendninja.constants.ViewsConstants;
import com.udemy.backendninja.model.ContactModel;

@Controller
@RequestMapping("/contact")
public class ContactController {

	@GetMapping("/")
	public String index() {
		return "redirect:/contact/list";
	}
	
	@GetMapping("/list")
	public String showListContacts() {
		return ViewsConstants.vcontact;
	}
	
	@GetMapping("/form")
	public String showFormContact(Model model) {
		model.addAttribute("contactModel", new ContactModel());
		return ViewsConstants.vcontactForm;
	}
	
	
	
}
