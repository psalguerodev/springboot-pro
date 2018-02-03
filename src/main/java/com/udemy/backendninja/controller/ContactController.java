package com.udemy.backendninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.udemy.backendninja.constants.ViewsConstants;
import com.udemy.backendninja.model.ContactModel;
import com.udemy.backendninja.service.ContactService;

@Controller
@RequestMapping("/contact")
public class ContactController {

	public static final Log LOG = LogFactory.getLog(ContactController.class);

	@Autowired
	@Qualifier("contactSeviceImpl")
	private ContactService contactService;

	@GetMapping("/")
	public String index() {
		return "redirect:/contact/list";
	}

	@GetMapping("/list")
	public String showListContacts(Model model) {
		LOG.info("Call showListContacts()");
		model.addAttribute("contacts", this.contactService.listContacts());
		return ViewsConstants.vcontact;
	}

	@GetMapping("/form")
	public String showFormContact(Model model) {
		LOG.info("Call showFormContact(Model model)");
		model.addAttribute("contactModel", new ContactModel());
		return ViewsConstants.vcontactForm;
	}

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

	@GetMapping("/delete")
	public String deleteContact( @RequestParam(name="code", required=true) int code ) {
		this.contactService.removeContact(code);
		return "redirect:/contact/list";
	}
}
