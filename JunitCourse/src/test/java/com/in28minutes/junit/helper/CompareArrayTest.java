package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;


import org.junit.Test;



public class CompareArrayTest {
	
	
	@Test
	public void testSortedArray() {
		int[] arr = {2, 6, 4 , 1};
		int[] expected = {1, 2, 4, 6};
		Arrays.sort(arr);
		// assertEquals(expected, arr); 
		// assertEquals doesn't match values of objects
		// Both(arr and expected) are the different objects in memory So assertEquals gives error
		
		// Use assertArrayEquals
		assertArrayEquals(expected, arr);
		
		
	}
	
	@Test(expected=NullPointerException.class)
	public void testSortedArray_WithNull(){
		int[] a = null;
		Arrays.sort(a);
		
	}
	@Test(timeout=100)
	public void testSortPerformance() {
		int arr[] = {75, 32, 21, 56};
		for(int i=0; i<1000000; i++) {
			arr[0] = i;
			Arrays.sort(arr);
		}
	}

}
