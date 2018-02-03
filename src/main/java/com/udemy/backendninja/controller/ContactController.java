package com.udemy.backendninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.udemy.backendninja.constants.ViewsConstants;
import com.udemy.backendninja.entity.User;
import com.udemy.backendninja.model.ContactModel;
import com.udemy.backendninja.service.ContactService;

// TODO: Auto-generated Javadoc
/**
 * The Class ContactController.
 */
@Controller
@RequestMapping("/contact")
public class ContactController {

	/** The Constant LOG. */
	public static final Log LOG = LogFactory.getLog(ContactController.class);

	/** The contact service. */
	@Autowired
	@Qualifier("contactSeviceImpl")
	private ContactService contactService;

	/**
	 * Index.
	 *
	 * @return the string
	 */
	@GetMapping("/")
	public String index() {
		return "redirect:/contact/list";
	}
	
/**
 * Show list contacts.
 *
 * @param model the model
 * @return the string
 */
//	@PreAuthorize("hasRole('ROLE_USER')")
	@GetMapping("/list")
	public String showListContacts(Model model) {
		LOG.info("Call showListContacts()");
		org.springframework.security.core.userdetails.User user = 
		(org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext()
															.getAuthentication().getPrincipal();
		model.addAttribute("username", user.getUsername());
		model.addAttribute("contacts", this.contactService.listContacts());
		return ViewsConstants.vcontact;
	}

	/**
	 * Show form contact.
	 *
	 * @param code the code
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/form")
	public String showFormContact( @RequestParam(name="code" , defaultValue="", required=false) int code ,
			Model model) {
		ContactModel cm = new ContactModel();
		if( code != 0 ) {
			cm = this.contactService.findModelByCode(code);
			if( cm == null ) cm = new ContactModel();
		}
		
		LOG.info("Call showFormContact(Model model)");
		LOG.info("Result: " + cm.toString() );
		
		model.addAttribute("contactModel", cm );
		return ViewsConstants.vcontactForm;
	}

	/**
	 * Adds the contact.
	 *
	 * @param model the model
	 * @param contactModel the contact model
	 * @return the string
	 */
	@PostMapping("/add")
	public String addContact(Model model, @ModelAttribute(name = "contactModel") ContactModel contactModel) {
		LOG.info("Call addContact(contactModel) --> " + contactModel.toString());

		ContactModel cm = this.contactService.addContact(contactModel);

		if (cm != null) {
			LOG.info("Add Contact SuccessFull!!");
			model.addAttribute("result", 1);
		} else {
			model.addAttribute("result", 0);
			LOG.error("Error! Contact Not Add");
		}
		model.addAttribute("contacts", this.contactService.listContacts() );
		return ViewsConstants.vcontact;
	}

	/**
	 * Delete contact.
	 *
	 * @param code the code
	 * @return the string
	 */
	@GetMapping("/delete")
	public String deleteContact( @RequestParam(name="code", required=true) int code ) {
		this.contactService.removeContact(code);
		return "redirect:/contact/list";
	}
}
