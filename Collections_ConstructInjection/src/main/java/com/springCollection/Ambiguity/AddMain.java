package com.springCollection.Ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCollection/Ambiguity/AddConfig.xml");
		Addition sum = context.getBean("add", Addition.class);
		sum.doSum();
	}
}
