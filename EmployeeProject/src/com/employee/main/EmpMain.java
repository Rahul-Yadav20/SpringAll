package com.employee.main;

import com.employee.*;


public class EmpMain {
	public static void main(String[] args) {
		Employeee e = new Employeee();
		Programmer p = new Programmer();
		Manager m = new Manager();
		Clerke c = new Clerke();
		
		System.out.println(e);
		System.out.println(p);
		System.out.println(m);
		System.out.println(c);
	}
}
