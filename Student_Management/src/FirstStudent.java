import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class FirstStudent {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Student Management System");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		while (true) {
			System.out.println("Enter 1 to add student:");
			System.out.println("Enter 2 to delete student:");
			System.out.println("Enter 3 to display student:");
			System.out.println("Enter 4 to exit:");
			int c = Integer.parseInt(br.readLine());

			if (c == 1) {
				// Add Student
				System.out.println("Enter Student Id :");
				String id = br.readLine();
				int i = Integer.parseInt(id);

				System.out.println("Enter student name :");
				String name = br.readLine();

				System.out.println("Enter student phone :");
				String phone = br.readLine();

				System.out.println("Enter student city :");
				String city = br.readLine();

				Student st = new Student(name, i, phone, city);
				boolean answer = StudentDao.insertStudent(st);
				if (answer) {
					System.out.println("Student is inserted successfully.....");
				} else {
					System.out.println("Something is wrong..");
				}
				//System.out.println(st);

			} else if (c == 2) {
				// Delete Student
				System.out.println("Enter student ID :");
				int userId = Integer.parseInt(br.readLine());
				
				boolean answer = StudentDao.deleteStudent(userId);
				if (answer) {
					System.out.println("Student is inserted successfully.....");
				} else {
					System.out.println("Something is wrong..");
				}
				
				
			} else if (c == 3) {
				
				// Display Student
				StudentDao.showDetails();
			
			} else if (c == 4) {
				
				// to exit
				break;
				
			} else {
				// default Message
				System.out.println("You have choosen wrong option..");
			}
		}
		System.out.println("Thanks Using Application");
	}

}
