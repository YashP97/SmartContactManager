package com.smartcontactmanager.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ld_contacts")
public class Contacts {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ld_id")
	private long id;
	@Column(name="ld_name")
	private String name;
	@Column(name="ld_address")
	private String address;
	@Column(name="ld_occupation")
	private String occupation;
	@Column(name="ld_mobile", unique=true)
	private String mobile;
	@Column(name="ld_email", unique=true)
	private String email;
	@Column(name="ld_website", unique=true)
	private String website;
	@Column(name="ld_jobtitle")
	private String jobtitle;
	@Column(name="ld_status")
	private String status;
	@ManyToOne
	private Users user;
	
	public Contacts() {
		super();
	}	

	public Contacts(String name, String address, String occupation, String mobile) {
		super();
		this.name = name;
		this.address = address;
		this.occupation = occupation;
		this.mobile = mobile;
	}

	public Contacts(String name, String address, String occupation, String mobile, Users user) {
		super();
		this.name = name;
		this.address = address;
		this.occupation = occupation;
		this.mobile = mobile;
		this.user = user;
	}

	public Contacts(String name, String address, String occupation, String mobile, String email,
			String website, String jobtitle, String status, Users user) {
		super();		
		this.name = name;
		this.address = address;
		this.occupation = occupation;
		this.mobile = mobile;
		this.email = email;
		this.website = website;
		this.jobtitle = jobtitle;
		this.user = user;
		this.status = status;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Contacts [id=" + id + ", name=" + name + ", address=" + address + ", occupation=" + occupation
				+ ", mobile=" + mobile + ", email=" + email + ", website=" + website + ", jobtitle=" + jobtitle
				+ ", status=" + status + ", user=" + user + "]";
	}	
}
