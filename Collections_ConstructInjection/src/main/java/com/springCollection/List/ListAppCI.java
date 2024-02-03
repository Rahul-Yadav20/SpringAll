package com.springCollection.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class ListAppCI 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springCollection/List/ListConfigCI.xml");
        StudentListCI student1 = (StudentListCI) context.getBean("student1");
        System.out.println(student1);
       
    }
}
