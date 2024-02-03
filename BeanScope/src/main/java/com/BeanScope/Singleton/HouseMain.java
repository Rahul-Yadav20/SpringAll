package com.BeanScope.Singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HouseMain {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/BeanScope/Singleton/HouseConfig.xml");

		House h = con.getBean("house", House.class);

		System.out.println(h.hashCode());	// Here we will create two objects of class house
											// But getting same hashcode for both objects		

		House h1 = con.getBean("house", House.class);	//Because IOC Container always create only single object for the class

		System.out.println(h1.hashCode());	// This is called Singleton scope because IOC Container same reference for multiple class objects (like h1, h2, h3.....)

	}
}
