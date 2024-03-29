package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Before_After {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class executed");
	}
	
	@Before
	public void testBefore() {
		System.out.println("Before test");
	}
	@Test
	public void test1() {
		System.out.println("Test1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 executed");
	}
	
	@After
	public void testAfter() {
		System.out.println("After test");
	}
	

	@AfterClass
	public static void afterClass() {
		System.out.println("After class executed");
	}


}
