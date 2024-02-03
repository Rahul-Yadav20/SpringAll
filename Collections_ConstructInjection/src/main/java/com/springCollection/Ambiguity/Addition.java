package com.springCollection.Ambiguity;

public class Addition {
	
	private int a;
	private int b;
	
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
		System.out.println("This is int method");
	}
	
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("This is double method");
	}
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("This is String method");
	}
	
	public void doSum() {
		
		System.out.println("Sum is "+(a+b));
	}
	
	
	
	

}
