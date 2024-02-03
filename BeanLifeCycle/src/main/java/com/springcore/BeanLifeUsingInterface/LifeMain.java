package com.springcore.BeanLifeUsingInterface;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/BeanLifeUsingInterface/LifeConfig.xml");
		LifeUsingInterface li = context.getBean("life",LifeUsingInterface.class);
		System.out.println(li);
		context.registerShutdownHook();
		
	}

}
