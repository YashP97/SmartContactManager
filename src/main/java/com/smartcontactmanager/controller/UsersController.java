package com.smartcontactmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smartcontactmanager.entities.Users;
import com.smartcontactmanager.services.UsersServices;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	private UsersServices usersser;
	private ContactsController cont_cont;
	
	@Autowired
	public UsersController(UsersServices usersser, ContactsController cont_cont) {
		this.usersser = usersser;
		this.cont_cont = cont_cont;
	}
	
	@ModelAttribute("newuser")
	public Users getUser() {
		return new Users();
	}
	
	@GetMapping
	public String getPage() {
		return "registration";
	}
	
	@GetMapping("/login")
	public String getloginPage() {
		return "login";
	}
	
	@PostMapping("/newregistration")
	public String saveUser(@ModelAttribute("newuser") Users user) {
		user.setRole("guest");
		usersser.saveUserEntity(user);		
		return "redirect:/users?success";
	}
	
	@PostMapping("/login")
	public String loginUser(@RequestParam String username, @RequestParam String password) {
		boolean logged = usersser.logUser(username, password);
		
		if(logged) {
			long id = usersser.findUserByUserName(username);
			cont_cont.setUser_id(id);
			return "redirect:/contacts/" + id;
		}else {
			return "redirect:/login?fail";
		}
	}
}
