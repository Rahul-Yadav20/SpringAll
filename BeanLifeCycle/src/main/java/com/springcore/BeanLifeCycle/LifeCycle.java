package com.springcore.BeanLifeCycle;

/**
 * Hello world!
 *
 */
public class LifeCycle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Set name");
	}

	public LifeCycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LifeCycle [name=" + name + "]";
	}

	public void init() {
		System.out.println("This is initialised method");
	}

	public void destroy() {
		System.out.println("This is destroy method");
	}

}
