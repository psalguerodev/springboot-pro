package com.udemy.backendninja.controller;

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
	
	@GetMapping("/")
	public String redirectToLogin() {
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String showLoginForm(Model model , @RequestParam(name="error", defaultValue="null" , required=false) String error ) {
		model.addAttribute("userCredential", new UserCredencial());
		model.addAttribute("error", error );
		return ViewsConstants.vlogin;
	}
	
	@PostMapping("/auth")
	public String loginCheck( @ModelAttribute(name="userCredential") UserCredencial userCredential ) {
		if( userCredential.getUsername().equals("user") && userCredential.getPassword().equals("user")){
			return ViewsConstants.vcontact;			
		}
		return "redirect:/login?error=true";
	}
	
}
