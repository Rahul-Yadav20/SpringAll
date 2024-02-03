package com.springCollection.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class SetAppCI 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springCollection/Set/SetConfigCI.xml");
        StudentSetCI student1 = (StudentSetCI) context.getBean("student1");
        System.out.println(student1);
        
      
    }
}
