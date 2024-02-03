package com.springCollection.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class MapAppCI 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springCollection/Map/MapConfigCI.xml");
        StudentMapCI student1 = (StudentMapCI) context.getBean("student1");
        System.out.println(student1);
      
      
    }
}
