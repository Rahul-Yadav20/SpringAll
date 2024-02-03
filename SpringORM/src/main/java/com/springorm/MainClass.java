package com.springorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


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
	public static void main( String[] args ) throws IOException
    {
       ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       ShopDao sd = con.getBean("dao", ShopDao.class);
       ShopKeeper sk = new ShopKeeper();
       int ch;
       do {
    	   System.out.println("Enter 1 to add new user\nEnter 2 to get single data\nEnter 3 to get all data\nEnter 4 to delete an user\nEnter 5 to update record\nEnter 6 to exit");
           System.out.println("Enter your choice: ");
           ch = Integer.parseInt(br.readLine());
    	   switch(ch){
    	   
    	   case 1: 	System.out.println("Enter id: ");
    	   			int id = Integer.parseInt(br.readLine());
    	   			System.out.println("Enter shop name: ");
    	   			String name = br.readLine();
    	   			System.out.println("Enter Location: ");
    	   			String location = br.readLine();
    	   			ShopKeeper s1 = new ShopKeeper(id, name,  location);
    	   			
    	   			System.out.println("Data Inserted......");
    	   			break;
    	   
    	   case 2: 	System.out.println("Enter shop No to fetch data: ");
    	   			int sid = Integer.parseInt(br.readLine());
    	   			ShopKeeper shop = sd.getShop(sid);
    	   			System.out.println(shop);
    	   			break;
    	   			
    	   case 3: 	List<ShopKeeper> list = sd.getAllShop();
    	   			for(ShopKeeper s: list)
    	   			{
    	   				System.out.println(s);
    	   			}
    	   			break;
    	   			
    	   case 4:	System.out.println("Enter shop no to delete record: ");
    	   			int i = Integer.parseInt(br.readLine());
    	   			sd.deleteShop(i);
    	   			System.out.println("Record Deleted...");
    	   			break;
    	   			
    	   case 5: 	System.out.println("Enter id to update record: ");
    	   			int uid = Integer.parseInt(br.readLine());
    	   			System.out.println("Enter shop name: ");
    	   			String sname = br.readLine();
    	   			sk.setName(sname);
    	   			System.out.println("Enter shop address: ");
    	   			String sadd = br.readLine();
    	   			sk.setAddress(sadd);
    	   			sd.updateShop(sk);
    	   			System.out.println("Record Updated.....");
    	   			
    	   case 6:	System.out.println("Thanks for using our application....");
    	   			break;
    	   
    	   default:	System.out.println("Enter Valid Choice....");
    	   }
    	   
    	   
    	   			
       }while(ch!=6);
       
       sd.getAllShop();
      
    }
}
