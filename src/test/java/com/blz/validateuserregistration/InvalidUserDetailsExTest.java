package com.blz.validateuserregistration;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class InvalidUserDetailsExTest {

	static ValidateUserRegistration obj;

	@BeforeClass
	public static void createFirstNameObj() {
		obj = new ValidateUserRegistration();
		System.out.println("In Before:");
	}

	@AfterClass
	public static void nullObj() {
		obj = null;
		System.out.println("In After:");
	}

	// Checking the validity of first name
	@Test
	public void testFirstNameWhenFirstCharIsCapswith3MinChar_thenAssertionSad() throws Exception {
		try {
			String result = obj.isValidFirstName("Ra");
		} catch (Exception e) {
			assertEquals("Invalid User first name....please try it once : ", e.getMessage());
		}
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testFirstNameWhenFirstCharIsCapswithMoreThan3Char_thenAssertionHappy() throws Exception {
		String result = obj.isValidFirstName("Ramayan");
		assertEquals("Matched", result);
		System.out.println("Successfully Passed TestCase");
	}

	// Checking the validity of Last name
	@Test
	public void testLastNameWhenFirstCharIsCapswith3MinChar_thenAssertionHappy() throws Exception {
		String result = obj.isValidLastName("Sri");
		assertEquals("Matched", result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testLastNameWhenFirstCharIsNotCapswith3MinChar_thenAssertionSad() throws Exception {
		try {
			String result = obj.isValidLastName("singh");
		} catch (Exception e) {
			assertEquals("Invalid User first name....please try it once : ", e.getMessage());
		}
		System.out.println("Fail To Pass TestCase");
	}

	// Checking the validity of email address
	@Test
	public void testEmailAddressWhenWeputOnlyMandatoryPart_thenAssertionHappy() throws Exception {
		String result = obj.isValidEmail("abc@bl.co");
		assertEquals("Matched", result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testEmailAddressWhenWeMissMandatoryPart_thenAssertionSad() throws Exception {
		try {
			String result = obj.isValidEmail("abc.bl.co.in");
		} catch (Exception e) {
			assertEquals("Invalid User email....please try it once : ", e.getMessage());
		}
		System.out.println("Fail To Pass TestCase");
	}

	// Checking the validity of MobileNo
	@Test
	public void testMobileNoWhenWeUseCountryCodeOfIndia_thenAssertionHappy() throws Exception {
		String result = obj.isValidMobileNo("91 7398066932");
		assertEquals("Matched", result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testMobileNoWhenWeUseDifferentCountryCode_thenAssertionSad() {
		try {
			String result = obj.isValidEmail("+49 8723459865");
		} catch (Exception e) {
			assertEquals("Invalid User MobileNo....please try it once : ", e.getMessage());
		}
		System.out.println("Fail To Pass TestCase");
	}

	// Checking the validity of Password
	@Test
	public void testPasswordWhenWeUsemin8Char_thenAssertionHappy() throws Exception {
		String result = obj.isValidPasswordAccToRule1("Afr45@fs");
		assertEquals("Matched", result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testPasswordWhenWeUseLessThan8Char_thenAssertionSad() throws Exception {
		try {
			String result = obj.isValidPasswordAccToRule1("hDth#7a");
		} catch (Exception e) {
			assertEquals("Invalid User Password....please follow the password pattern : ", e.getMessage());
		}
		System.out.println("Fail To Pass TestCase");
	}

	// Checking the validity of Password According to Rule 2
	@Test
	public void testPassword2WhenWeUsemin8CharWithAtleastOneUpperCase_thenAssertionHappy() throws Exception {
		String result = obj.isValidPasswordAccToRule2("asas23#A");
		assertEquals("Matched", result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testPassword2WhenWeUseLessThan8CharWithoutAtleastOneUpperCase_thenAssertionSad() throws Exception {
		try {
			String result = obj.isValidPasswordAccToRule2("a12@#dfg");
		} catch (Exception e) {
			assertEquals("Invalid User Password....please follow the password pattern : ", e.getMessage());
		}
		System.out.println("Fail To Pass TestCase");
	}

	// Checking the validity of Password According to Rule 3
	@Test
	public void testPassword3WhenWeUsemin8CharWithAtleastOneUpperCaseAndOneNumericValue_thenAssertionHappy()
			throws Exception {
		String result = obj.isValidPasswordAccToRule3("asWsq@D6");
		assertEquals("Matched", result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testPassword3WhenWeUseLessThan8CharWithoutOneUpperCaseAndOneNumericValue_thenAssertionSad()
			throws Exception {
		try {
			String result = obj.isValidPasswordAccToRule3("asdgfbv@");
		} catch (Exception e) {
			assertEquals("Invalid User Password....please follow the password pattern : ", e.getMessage());
		}
		System.out.println("Fail To Pass TestCase");
	}

	// Checking the validity of Password According to Rule 4
	@Test
	public void testPassword4WhenWeUsemin8CharWithAtleastOneUpperCaseOneNumericValueAndOneSpecialChar_thenAssertionHappy()
			throws Exception {
		String result = obj.isValidPasswordAccToRule4("AsWqsD6!");
		assertEquals("Matched", result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testPassword4WhenWeUseLessThan8CharWithoutOneUpperCaseOneNumericValueAndOneSpecialChar_thenAssertionSad()
			throws Exception {
		try {
			String result = obj.isValidPasswordAccToRule4("AsvfSA4s");
		} catch (Exception e) {
			assertEquals("Invalid User Password....please follow the password pattern : ", e.getMessage());
		}
		System.out.println("Fail To Pass TestCase");
	}
}
