package com.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	
	private String mail;
	
	private String name;

	private String password;
	
	private Date date;

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Contact(String mail, String name, String pass) {
		super();
		this.mail = mail;
		this.name = name;
		this.password = pass;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Contact [mail=" + mail + ", name=" + name + ", password=" + password + "]";
	}

}
