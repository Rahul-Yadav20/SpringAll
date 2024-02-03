package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

//import org.junit.After;
//import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperTest {

	StringHelper str = new StringHelper();
	
	/*
	 * @Before public void testBefore() {
	 * 
	 * System.out.println("Before test");
	 * 
	 * }
	 */
	
	private String input;
	private String expectedOutput;
	
	public StringHelperTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	@Parameters
	public static Collection<String[]> checkCondition() {
		String expectedOutput [][] = {{"AACD", "CD"}, {"ABC", "BC"}};
		return Arrays.asList(expectedOutput);
	}
	
	@Test
	public void test2truncateAInFirst2Positions() {
		assertEquals(expectedOutput, str.truncateAInFirst2Positions(input));
	}
	
	
	
	
	@Test
	public void test1truncateAInFirst2Positions() {
		assertEquals("BCD", str.truncateAInFirst2Positions("ABCD"));
	}
	
	@Test
	public void test1AreFirstAndLastTwoCharactersTheSame() {
		assertFalse(str.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void test2AreFirstAndLastTwoCharactersTheSame() {
		assertTrue(str.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
//	@After
//	public void afterTest() {
//		System.out.println("After test");
//	}

}
