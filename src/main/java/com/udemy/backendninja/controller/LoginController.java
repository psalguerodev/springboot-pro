package com.udemy.backendninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.udemy.backendninja.constants.ViewsConstants;
import com.udemy.backendninja.model.UserCredencial;

@Controller
public class LoginController {
	
	private static final Log LOG = LogFactory.getLog(LoginController.class);
	
	@GetMapping("/")
	public String redirectToLogin() {
		LOG.info("::Redirect to Login::");
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String showLoginForm(Model model , 
			@RequestParam(name="logout", required=false) String logout,
			@RequestParam(name="error", defaultValue="null" , required=false) String error ) {

		LOG.info("Login View:: " + "error -> " + error + " logout -> " + logout);
		model.addAttribute("userCredential", new UserCredencial());
		model.addAttribute("logout" , logout );
		model.addAttribute("error", error );
		return ViewsConstants.vlogin;
	}
	
	@PostMapping("/auth")
	public String loginCheck( @ModelAttribute(name="userCredential") UserCredencial userCredential ) {
		LOG.info("Call: loginCheck( userCrendential ) " + userCredential.toString() );
		if( userCredential.getUsername().equals("user") && userCredential.getPassword().equals("user")){
			return "redirect:/contact/";			
		}
		return "redirect:/login?error=true";
	}
	
}
