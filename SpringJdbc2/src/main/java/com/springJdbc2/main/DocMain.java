package com.springJdbc2.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;



//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//mport org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.springJdbc2.configuration.DocConfigJava;
//import com.springJdbc2.configuration.DocConfig;
import com.springJdbc2.dao.DoctorDao;

import com.springJdbc2.resource.Doctor;
import com.springJdbc2.resource.Patient;


public class DocMain {
	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext(("com/springJdbc2/configuration/DocConfig.xml"));
	
		int choice;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		DoctorDao da = con.getBean("dao", DoctorDao.class);
		Doctor doctor = new Doctor();
		
		con.close();
		System.out.println("----------Welcome to our Spring Project-------------");
		
		do {
		System.out.println("Enter 1 for insert operation\nEnter 2 for update operation\nEnter 3 for delete operation\nEnter 4 to display\nEnter 5 to display all records\nEnter 6 for Exit");
		choice = Integer.parseInt(br.readLine());
			switch(choice)
			{	
				/*--------------Insert Query---------------------------------*/
				case 1:	
					try {
					System.out.println("Enter doctor id: ");
					int id = Integer.parseInt(br.readLine());
					doctor.setId(id);
					System.out.println("Enter doctor name: ");
					String name = br.readLine();
					doctor.setName(name);
					System.out.println("Enter phone no.: ");
					int ph = Integer.parseInt(br.readLine());
					doctor.setPhone(ph);
					System.out.println("Enter doctor address: ");
					String add = br.readLine();
					doctor.setAddress(add);
					System.out.println("Enter doctor department: ");
					String dept = br.readLine();
					doctor.setDept(dept);
					System.out.println("Row Inserted....."+ da.insert(doctor));
					break;	
					}catch(IOException e) {
						e.printStackTrace();
					}
					break;
				
				case 2:
					System.out.println("You can update Doctor's Phone number and Address...");
					System.out.println("Enter doctor id to upadte a record: ");
					int id1 = Integer.parseInt(br.readLine());
					doctor.setId(id1);
					System.out.println("Enter updated phone number: ");
					int ph = Integer.parseInt(br.readLine());
					doctor.setPhone(ph);
					System.out.println("Enter updated address: ");
					String add = br.readLine();
					doctor.setAddress(add);
					System.out.println("Row Updated....."+ da.modify(doctor));
					break;
				case 3:
					System.out.println("Enter doctor id to delete a record: ");
					int id2 = Integer.parseInt(br.readLine());
					doctor.setId(id2);
					System.out.println("Row Deleted....."+ da.delet(doctor));
					break;
				case 4:
					System.out.println("Enter id to display record: ");
					int id3 = Integer.parseInt(br.readLine());
					Doctor doctor1 = da.display(id3);
					System.out.println("Data fetched....\n"+doctor1);
					break;
				case 5:
					List<Doctor> doc = da.displayAll();
					for(Doctor d: doc) {
						System.out.println(d);
					}
					break;
					
				case 6:
					System.out.println("Thanks for using our app.........");
					break;
					
				default:
					System.out.println("Enter valid choice....");
					break;
			}
					
		}while(choice!=6);
		
		
/*-------------------------------Insert Query(Not recommended method for insert operation)---------------------------------------*/	
//		  JdbcTemplate jdt = con.getBean("jdbc", JdbcTemplate.class);
//		  
//		  String query = "insert into doctorDetails(id, name, dept, phone, address) values(?, ?, ?, ?, ?)";
//	  
//		  int result = jdt.update(query, 2738, "Dr. Datt", "Gernal", 989389289, "Australia"); 
//		  int result2 = jdt.update(query, 9089, "Dr. Singhal", "Physcologist", 830892083, "Singapore");
//		  System.out.println("Inserted row is "+result2);
		 
		 

		
	
		
		
//		DoctorDao da = con.getBean("dao", DoctorDao.class);
//		Doctor doctor = new Doctor();
//		Patient patient = new Patient();
//		
//		doctor.setId(9089);
//		System.out.println("Row deleted..."+da.delet(doctor, patient));
			
}
}
