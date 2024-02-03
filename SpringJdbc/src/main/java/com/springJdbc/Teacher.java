package com.springJdbc;

/**
 * Hello world!
 *
 */
public class Teacher {
	private int id;
	private String name;
	private String subject;
	private int rating;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Teacher(int id, String name, String subject, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.rating = rating;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
