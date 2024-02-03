package com.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.ShopDao;
import com.springorm.entities.ShopKeeper;
/**
 The Java ORM standard for storing, accessing, and managing Java objects in a relational database
 *
 */
public class MainClass 
{
	public static void main( String[] args )
    {
       ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
       
       ShopDao sd = con.getBean("shopdao", ShopDao.class);
     
       ShopKeeper s1 = new ShopKeeper(3342, "Ramesh Gernal Store",  "Tamil Nadu");
       int result = sd.insert(s1);
       System.out.println("Data Inserted......"+result);
    }
}
