package com.StandAloneCollections.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/StandAloneCollections/List/AloneConfig.xml");
		Person per = context.getBean("p", Person.class);
		System.out.println(per);
		System.out.println(per.getFee().getClass().getName());
		System.out.println("\n-------------------------------------------------");
		System.out.println(per.getFee());
		System.out.println(per.getFee().getClass().getName());
		System.out.println("\n-------------------------------------------------");
		System.out.println(per.getProperty());
		System.out.println(per.getProperty().getClass().getName());
		
	}
}
