package com.blz.validateuserregistration;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ValidateUserRegistrationTest {

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
	public void testFirstNameWhenFirstCharIsCapswith3MinChar_thenAssertionHappy() {
		boolean result = obj.isValidFirstName("Ram");
		assertEquals(true, result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testFirstNameWhenFirstCharIsCapswithMoreThan3Char_thenAssertionHappy() {
		boolean result = obj.isValidFirstName("Ramchandra");
		assertEquals(true, result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testFirstNameWhenFirstCharIsNotCapswith3MinChar_thenAssertionSad() {
		boolean result = obj.isValidFirstName("rama");
		assertEquals(true, result);
		System.out.println("Fail To Pass TestCase");
	}

	@Test
	public void testFirstNameWhenFirstCharIsCapswith2MinChar_thenAssertionSad() {
		boolean result = obj.isValidFirstName("Ra");
		assertEquals(true, result);
		System.out.println("Fail To Pass TestCase");
	}

	// Checking the validity of Last name
	@Test
	public void testLastNameWhenFirstCharIsCapswith3MinChar_thenAssertionHappy() {
		boolean result = obj.isValidLastName("Sri");
		assertEquals(true, result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testLastNameWhenFirstCharIsCapswithMoreThan3Char_thenAssertionHappy() {
		boolean result = obj.isValidLastName("Srivastava");
		assertEquals(true, result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testLastNameWhenFirstCharIsNotCapswith3MinChar_thenAssertionSad() {
		boolean result = obj.isValidLastName("singh");
		assertEquals(true, result);
		System.out.println("Fail To Pass TestCase");
	}

	@Test
	public void testLastNameWhenFirstCharIsCapswith2MinChar_thenAssertionSad() {
		boolean result = obj.isValidLastName("Si");
		assertEquals(true, result);
		System.out.println("Fail To Pass TestCase");
	}

	// Checking the validity of email address
	@Test
	public void testEmailAddressWhenWeputOnlyMandatoryPart_thenAssertionHappy() {
		boolean result = obj.isValidEmail("abc@bl.co");
		assertEquals(true, result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testEmailAddressWhenWeputMandatoryAndOptionalPart_thenAssertionHappy() {
		boolean result = obj.isValidEmail("abc.xyz@bl.co.in");
		assertEquals(true, result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testEmailAddressWhenWeMissMandatoryPart_thenAssertionSad() {
		boolean result = obj.isValidEmail("abc.bl.co.in");
		assertEquals(true, result);
		System.out.println("Fail To Pass TestCase");
	}

	// Checking the validity of MobileNo
	@Test
	public void testMobileNoWhenWeUseCountryCodeOfIndia_thenAssertionHappy() {
		boolean result = obj.isValidMobileNo("91 7398066932");
		assertEquals(true, result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testMobileNoWhenWeUseDifferentCountryCode_thenAssertionSad() {
		boolean result = obj.isValidEmail("+49 8723459865");
		assertEquals(true, result);
		System.out.println("Fail To Pass TestCase");
	}

	@Test
	public void testMobileNoWhenWeUseWrongFormat_thenAssertionSad() {
		boolean result = obj.isValidEmail("91 4323459865");
		assertEquals(true, result);
		System.out.println("Fail To Pass TestCase");
	}

	// Checking the validity of Password
	@Test
	public void testPasswordWhenWeUsemin8Char_thenAssertionHappy() {
		boolean result = obj.isValidPasswordAccToRule1("Afr45@fs");
		assertEquals(true, result);
		System.out.println("Successfully Passed TestCase");
	}

	@Test
	public void testPasswordWhenWeUseLessThan8Char_thenAssertionSad() {
		boolean result = obj.isValidPasswordAccToRule1("hDth#7a");
		assertEquals(true, result);
		System.out.println("Fail To Pass TestCase");
	}
	
	// Checking the validity of Password According to Rule 2
		@Test
		public void testPassword2WhenWeUsemin8CharWithAtleastOneUpperCase_thenAssertionHappy() {
			boolean result = obj.isValidPasswordAccToRule2("asas23#A");
			assertEquals(true, result);
			System.out.println("Successfully Passed TestCase");
		}

		@Test
		public void testPassword2WhenWeUseLessThan8CharWithAtleastOneUpperCase_thenAssertionSad() {
			boolean result = obj.isValidPasswordAccToRule2("a12@#dfg");
			assertEquals(true, result);
			System.out.println("Fail To Pass TestCase");
		}
}
