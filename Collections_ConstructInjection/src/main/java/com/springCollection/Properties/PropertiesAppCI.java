package com.springCollection.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class PropertiesAppCI 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springCollection/Properties/PropertiesConfigCI.xml");
        StudentPropertiesCI student1 = (StudentPropertiesCI) context.getBean("student1");
        System.out.println(student1);
         
    }
}
