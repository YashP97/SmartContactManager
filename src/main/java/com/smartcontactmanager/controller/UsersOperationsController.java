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
	private long id = 0L;

	@Autowired
	public UsersOperationsController(ContactsServices contactservices) {
		this.contactservices = contactservices;
	}

	@GetMapping("/info")
	public String getContactInfo(@RequestParam String id, Model model) {
		this.id = Long.parseLong(id);
		Contacts contact = contactservices.getContactbyId(Long.parseLong(id));
		model.addAttribute("contactinfo", contact);
		return "contactinfo";
	}

	@PostMapping("/edit")
	public void editingcontacts(@RequestParam String text, @RequestParam String key) {
		System.out.println("text = " + text + " key = " + key);

		Contacts contact = contactservices.getContactbyId(id);

		switch (key) {
			case "1":
				contact.setName(text);
				break;
			case "2":
				contact.setOccupation(text);
				break;
			case "3":
				contact.setJobtitle(text);
				break;
			case "4":
				contact.setMobile(text);
				break;
			case "5":
				contact.setAddress(text);
				break;
			case "6":
				contact.setEmail(text);
				break;
			case "7":
				contact.setWebsite(text);
				break;			
		}
		
		contactservices.saveContact(contact);
	}

	@DeleteMapping("/delete")
	public String deletecontact(@RequestParam String id) {
		contactservices.deleteContact(Long.valueOf(id));
		return "redirect:/contacts";
	}
}
