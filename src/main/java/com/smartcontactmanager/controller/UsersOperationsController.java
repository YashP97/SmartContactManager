package com.smartcontactmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class UsersOperationsController {
	
	@GetMapping("/info")
	public String getContactInfo() {
		return "Hello";
	}
}