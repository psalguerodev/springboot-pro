package com.udemy.backendninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.udemy.backendninja.constants.ViewsConstants;
import com.udemy.backendninja.model.UserCredencial;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginController.
 */
@Controller
public class LoginController {
	
	/** The Constant LOG. */
	private static final Log LOG = LogFactory.getLog(LoginController.class);
	
	/**
	 * Show login form.
	 *
	 * @param model the model
	 * @param logout the logout
	 * @param error the error
	 * @return the string
	 */
	@GetMapping("/login")
	public String showLoginForm(Model model , 
			@RequestParam(name="logout", required=false) String logout,
			@RequestParam(name="error" , required=false) String error ) {

		LOG.info("Login View:: " + "error -> " + error + " logout -> " + logout);
		model.addAttribute("userCredential", new UserCredencial());
		model.addAttribute("logout" , logout );
		model.addAttribute("error", error );
		return ViewsConstants.vlogin;
	}
	
	/**
	 * Login check.
	 *
	 * @return the string
	 */
	@GetMapping({"/loginsuccess", "/"})
	public String loginCheck() {
		LOG.info("Call loginCheck()");
		return "redirect:/contact/list";			
		
	}
	
}
