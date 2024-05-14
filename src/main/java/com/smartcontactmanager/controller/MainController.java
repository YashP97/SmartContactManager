package com.smartcontactmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping
	public String getWelcomePage() {
		return "welcome";
	}
	
	@GetMapping("/login")
	public String getloginPage() {
		return "login";
	}
	
	@GetMapping("/register")
	public String getRegisterationPage() {
		return "registration";
	}
}
