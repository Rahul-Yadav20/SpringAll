package com.StaticMethodVariable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/* Spring Expression Langauge supports parsing 
 * and executing expression with the help of @Value annotation
 * @Value("#{expression}")
 */

// Static method can call using the syntax T(className).method(param)
// Variable can call using the Syntax T(class).variable 

@Component
public class ExpressionClass {

	@Value("#{20+30}")
	private int x;

	@Value("#{2+35}")
	private int y;

	@Value("#{ T(java.lang.Math).sqrt(100)}")	// Using Regular expression you can access classes (like Math) and its method(like sqrt())
	private int z;
	
	@Value("#{ T(java.lang.Math).PI}")	// And also access the variables of class (like PI variable)
	private double piValue;

	@Value("#{new java.lang.String('Rahul Yadav')}")	// U can also create objects of classes
	private String name;
	
	@Value("#{ 10<8 }")
	private boolean isTrue;	
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double getPiValue() {
		return piValue;
	}

	public void setPiValue(double piValue) {
		this.piValue = piValue;
	}

	@Override
	public String toString() {
		return "ExpressionClass [x=" + x + ", y=" + y + ", z=" + z + ", piValue=" + piValue + ", name=" + name
				+ ", isTrue=" + isTrue + "]";
	}

	

}
