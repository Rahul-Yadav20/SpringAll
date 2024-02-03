package com.springcore_properties;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class PropertiesApp 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_properties/PropertiesConfig.xml");
        StudentProperties student1 = (StudentProperties) context.getBean("student1");
        System.out.println(student1.getName());
        System.out.println(student1.getProps());
      
    }
}
