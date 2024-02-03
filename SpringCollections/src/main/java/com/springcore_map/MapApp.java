package com.springcore_map;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class MapApp 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_map/MapConfig.xml");
        StudentMap student1 = (StudentMap) context.getBean("student1");
        System.out.println(student1.getName());
        System.out.println(student1.getCourse());
      
    }
}
