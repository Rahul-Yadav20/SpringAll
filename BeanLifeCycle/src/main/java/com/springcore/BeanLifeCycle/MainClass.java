package com.springcore.BeanLifeCycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/BeanLifeCycle/ConfigLifeCycle.xml");
		LifeCycle lc = context.getBean("blc", LifeCycle.class);
		System.out.println(lc);
		
		//This method is predefined in AbstractApplicationContext class
		context.registerShutdownHook();
		
	}
}
