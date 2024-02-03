package com.springcore_set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore_map.StudentMap;
/**
 * Hello world!
 *
 */
public class SetApp 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_set/SetConfig.xml");
        StudentSet student1 = (StudentSet) context.getBean("student1");
        System.out.println(student1.getName());
        System.out.println(student1.getAddress());
      
    }
}
