package com.removexml.JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeaMain {
	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
		Teacher t = con.getBean("getTeacher", Teacher.class);
		// Teacher t = con.getBean("sir", Teacher.class); // As you defined in Bean annotation 
		System.out.println(t);
		
	}
}
