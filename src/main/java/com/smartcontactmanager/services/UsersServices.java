package com.smartcontactmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontactmanager.entities.Users;
import com.smartcontactmanager.repository.UsersRepository;

@Service
public class UsersServices {
	
	private UsersRepository usersrepo;
	
	@Autowired
	public UsersServices(UsersRepository usersrepo) {
		this.usersrepo = usersrepo;
	}
	
	public void saveUserEntity(Users user) {
		usersrepo.save(user);
	}
		
	public long findUserByUserName(String user) {
		long id = 0L;
				
		String case_user = user.toLowerCase();
		
		List<Users> user_list = usersrepo.findAll();
		for(Users userr : user_list) {
			if(case_user.contains("@") && case_user.equals(userr.getEmail().toLowerCase())) {				
				id = userr.getId();
				break;
			}else if(!case_user.contains("@") && userr.getUsername().toLowerCase().equals(case_user)) {
				id = userr.getId();
				break;
			}
		}
		
		return id;
	}
	
	public boolean logUser(String user, String pass) {
		boolean logged = false;
		
		if(user == null || pass == null)
			return false;
		
		long id = findUserByUserName(user);
		
		if(id == 0)
			return false;
		
		Users log_user = usersrepo.getById(id);
		
		if(pass.equals(log_user.getPassword())) {
			logged = true;
		}		
		
		return logged;
	}	
}
