package com.smartcontactmanager.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ld_users")
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ld_id")
	private long id;
	@Column(name="ld_name")
	private String name;
	@Column(name="ld_username", unique=true)
	private String username;
	@Column(name="ld_email", unique=true)
	private String email;
	@Column(name="ld_password", unique=true)
	private String password;
	@Column(name="ld_address")
	private String address;
	@Column(name="ld_role")
	private String role;
	@Column(name="ld_description", length=500)
	private String description;
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY,mappedBy = "user")
	private List<Contacts> contacts = new ArrayList<>();
	
	public Users() {
		super();
	}		

	public Users(long id, String name, String username, String email, String password, String address, String role,
			String description) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.address = address;
		this.role = role;
		this.description = description;
	}

	public Users(String name, String username, String email, String password, String address, String role,
			String description, List<Contacts> contacts) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.address = address;
		this.role = role;
		this.description = description;
		this.contacts = contacts;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	
	public List<Contacts> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contacts> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", password="
				+ password + ", address=" + address + ", role=" + role + ", description=" + description + ", contacts="
				+ contacts + "]";
	}	
}
