package com.blz.userregistration;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationTest {

	static UserRegistration obj;

	@BeforeClass
	public static void createFirstNameObj() {
		obj = new UserRegistration();
		System.out.println("In Before:");
	}

	@AfterClass
	public static void nullObj() {
		obj = null;
		System.out.println("In After:");
	}

	// Checking the validity of first name
	@Test
	public void testFirstNameWhenFirstCharIsCapswith3MinChar_thenAssertionHappy() {
		String result = obj.isValidFirstName("Ram");
		assertEquals("Matched", result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testFirstNameWhenFirstCharIsCapswithMoreThan3Char_thenAssertionHappy() {
		String result = obj.isValidFirstName("Ramchandra");
		assertEquals("Matched", result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testFirstNameWhenFirstCharIsNotCapswith3MinChar_thenAssertionSad() {
		String result = obj.isValidFirstName("rama");
		assertEquals("Matched", result);
		System.out.println("Fail To Pass TestCase");
	}

	@Test
	public void testFirstNameWhenFirstCharIsCapswith2MinChar_thenAssertionSad() {
		String result = obj.isValidFirstName("Ra");
		assertEquals("Matched", result);
		System.out.println("Fail To Pass TestCase");
	}

}
