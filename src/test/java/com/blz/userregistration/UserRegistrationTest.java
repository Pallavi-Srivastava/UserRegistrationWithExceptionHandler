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

	// Checking the validity of Last name
	@Test
	public void testLastNameWhenFirstCharIsCapswith3MinChar_thenAssertionHappy() {
		String result = obj.isValidLastName("Sri");
		assertEquals("Matched", result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testLastNameWhenFirstCharIsCapswithMoreThan3Char_thenAssertionHappy() {
		String result = obj.isValidLastName("Srivastava");
		assertEquals("Matched", result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testLastNameWhenFirstCharIsNotCapswith3MinChar_thenAssertionSad() {
		String result = obj.isValidLastName("singh");
		assertEquals("Matched", result);
		System.out.println("Fail To Pass TestCase");
	}

	@Test
	public void testLastNameWhenFirstCharIsCapswith2MinChar_thenAssertionSad() {
		String result = obj.isValidLastName("Si");
		assertEquals("Matched", result);
		System.out.println("Fail To Pass TestCase");
	}

	// Checking the validity of email address
	@Test
	public void testEmailAddressWhenWeputOnlyMandatoryPart_thenAssertionHappy() {
		String result = obj.isValidEmail("abc@bl.co");
		assertEquals("Matched", result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testEmailAddressWhenWeputMandatoryAndOptionalPart_thenAssertionHappy() {
		String result = obj.isValidEmail("abc.xyz@bl.co.in");
		assertEquals("Matched", result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testEmailAddressWhenWeMissMandatoryPart_thenAssertionSad() {
		String result = obj.isValidEmail("abc.bl.co.in");
		assertEquals("Matched", result);
		System.out.println("Fail To Pass TestCase");
	}

	// Checking the validity of MobileNo
	@Test
	public void testMobileNoWhenWeUseCountryCodeOfIndia_thenAssertionHappy() {
		String result = obj.isValidMobileNo("91 7398066932");
		assertEquals("Matched", result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testMobileNoWhenWeUseDifferentCountryCode_thenAssertionSad() {
		String result = obj.isValidEmail("+49 8723459865");
		assertEquals("Matched", result);
		System.out.println("Fail To Pass TestCase");
	}

	@Test
	public void testMobileNoWhenWeUseWrongFormat_thenAssertionSad() {
		String result = obj.isValidEmail("91 4323459865");
		assertEquals("Matched", result);
		System.out.println("Fail To Pass TestCase");
	}

}
