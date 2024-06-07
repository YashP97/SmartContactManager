package com.smartcontactmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartcontactmanager.entities.Contacts;
import com.smartcontactmanager.entities.Users;
import com.smartcontactmanager.repository.UsersRepository;
import com.smartcontactmanager.services.ContactsServices;

@Controller
@RequestMapping("/contacts")
public class ContactsController {

	private ContactsServices contactsser;
	private  UsersRepository usersrepo;
	private long user_id;
	private String username;

	@Autowired
	public ContactsController(ContactsServices contactsser,  UsersRepository usersrepo) {
		this.contactsser = contactsser;
		this.usersrepo = usersrepo;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@ModelAttribute("contact")
	public Contacts newContact() {
		return new Contacts();
	}

//	@GetMapping("/{id}")
	@GetMapping()
	public String getUserPage(Model model) {
		long idd = getUser_id();
		List<Contacts> useren = contactsser.getContactsbyUserId(idd);
		model.addAttribute("contacts", useren);	
		model.addAttribute("totalcontacts", useren.size());
		model.addAttribute("username", getUsername().toUpperCase());
		return "user";
	}
	
	@PostMapping
	public String addContacts(@ModelAttribute("contact") Contacts contact) {
		long idd = getUser_id();		
		@SuppressWarnings("deprecation")
		Users user = usersrepo.getById(idd);
		contact.setUser(user);		
		
		contactsser.saveContact(contact);
				
//		return "redirect:/contacts/" + idd;
		return "redirect:/contacts";
	}
}
