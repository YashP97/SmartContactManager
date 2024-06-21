package com.smartcontactmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smartcontactmanager.entities.Contacts;
import com.smartcontactmanager.services.ContactsServices;

@Controller
@RequestMapping("/contact")
public class UsersOperationsController {
	
	private ContactsServices contactservices;
	
	@Autowired
	public UsersOperationsController(ContactsServices contactservices) {
		this.contactservices = contactservices;
	}
	
	@GetMapping("/info")
	public String getContactInfo(@RequestParam String id, Model model) {
		Contacts contact = contactservices.getContactbyId(Long.parseLong(id));
		model.addAttribute("contactinfo", contact);
		return "contactinfo";
	}
	
	@PostMapping("/edit")
	public void editingcontacts() {
		
	}
	
	@DeleteMapping("/delete")
	public String deletecontact(@RequestParam String id) {		
		contactservices.deleteContact(Long.valueOf(id));		
		return "redirect:/contacts";
	}
}
