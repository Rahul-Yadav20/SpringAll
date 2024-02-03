package EmployeeDatabase;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EmployeeDetails {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("----------Employee Management Database----------");
			System.out.println("Press i to Insert a New Employee");
			System.out.println("Press d to delete a Employee");
			System.out.println("Write \"show\" to see details");
			System.out.println("Write \"exit\" to exit from system");
			String str = br.readLine();
			
			if(str.equals("i")) 
			{	
				boolean flag = false;
				// Insert Employee
				
				System.out.println("Enter employee ID :");
				int id = Integer.parseInt(br.readLine());
				System.out.println("Enter employee name :");
				String name = br.readLine();
				System.out.println("Enter employee phone no :");
				String phone = br.readLine();
				System.out.println("Enter employee location :");
				String location = br.readLine();
				
				Employee em = new Employee(id, name, phone, location);
				flag = EmployeeDAO.insertEmployee(em);
				
				if(flag) {
					System.out.println("Inserted Successfully...");
				}else
				{
					System.out.println("Something went Wrong, try again!!");
				}
			}
			else if(str.equals("d"))
			{
				// Delete employee
				boolean flag=false;
				System.out.println("Enter employee ID :");
				int id = Integer.parseInt(br.readLine());
				flag = EmployeeDAO.deleteEmployee(id);
				if(flag) {
					System.out.println("Employee deleted successfully....");
				}
				else {
					System.out.println("Something went worng, try again....");
				}
			}
			else if(str.equals("show"))
			{
				// show details
				
				EmployeeDAO.showDetails();
				
			}
			else if(str.equals("exit"))
			{
				break;
			}
			else {
				System.out.println("Enter a valid keyword!!");
			}
			
		}
		System.out.println("Thanks for using our application");
	}

}
