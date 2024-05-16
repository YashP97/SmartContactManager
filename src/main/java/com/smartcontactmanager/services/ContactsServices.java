package com.smartcontactmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontactmanager.entities.Contacts;
import com.smartcontactmanager.repository.ContactsRepository;

@Service
public class ContactsServices {
	
	private ContactsRepository contactsrepo;
	
	@Autowired
	public ContactsServices(ContactsRepository contactsrepo) {
		this.contactsrepo = contactsrepo;
	}
	
	public List<Contacts> getAllContacts(){
		List<Contacts> users = contactsrepo.findAll();		
		return users;
	}
	
	public void saveContact(Contacts contact) {
		contactsrepo.save(contact);
	}
	
	public List<Contacts> getContactsbyUserId(long id) {
		List<Contacts> contacts =  contactsrepo.findByUserId(id);
		return contacts;
	}
}
