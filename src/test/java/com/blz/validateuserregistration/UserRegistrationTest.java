package com.blz.validateuserregistration;

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
	public void testFirstNameWhenFirstCharIsCapswithMoreThan3Char_thenAssertionHappy()
			throws InvalidFirstNameException {
		try {
			assertTrue(obj.isValidFirstName("Pallavi"));
		} catch (InvalidFirstNameException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testFirstNameWhenFirstCharIsCapswitLessThan3Char_thenAssertionSad() throws InvalidFirstNameException {
		try {
			assertTrue(obj.isValidFirstName("Pa"));
		} catch (InvalidFirstNameException e) {
			System.out.println(e.getMessage());
		}
	}

	// Checking the validity of Last name
	@Test
	public void testLastNameWhenFirstCharIsCapswith3MinChar_thenAssertionHappy() throws InvalidLastNameException {
		try {
			assertTrue(obj.isValidLastName("Srivastava"));
		} catch (InvalidLastNameException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testLastNameWhenFirstCharIsNotCapswith3MinChar_thenAssertionSad() throws InvalidLastNameException {
		try {
			assertTrue(obj.isValidLastName("sr"));
		} catch (InvalidLastNameException e) {
			System.out.println(e.getMessage());
		}
	}

	// Checking the validity of email address
	@Test
	public void testEmailAddressWhenWeputOnlyMandatoryPart_thenAssertionHappy() throws InvalidEmailException {
		try {
			assertTrue(obj.isValidEmail("abc@bl.co"));
		} catch (InvalidEmailException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testEmailAddressWhenWeMissMandatoryPart_thenAssertionSad() throws InvalidEmailException {
		try {
			assertTrue(obj.isValidEmail("abc.bl.co.in"));
		} catch (InvalidEmailException e) {
			System.out.println(e.getMessage());
		}
	}

	// Checking the validity of MobileNo
	@Test
	public void testMobileNoWhenWeUseCountryCodeOfIndia_thenAssertionHappy() throws InvalidMobileNoException {
		try {
			assertTrue(obj.isValidMobileNo("91 7398066932"));
		} catch (InvalidMobileNoException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testMobileNoWhenWeUseDifferentCountryCode_thenAssertionSad() throws InvalidMobileNoException {
		try {
			assertTrue(obj.isValidMobileNo("+49 8723459865"));
		} catch (InvalidMobileNoException e) {
			System.out.println(e.getMessage());
		}
	}

	// Checking the validity of Password According to All Rule
	@Test
	public void testPasswordWhenWeUsemin8CharWithAtleastOneUpperCaseOneNumericValueAndOneSpecialChar_thenAssertionHappy()
			throws InvalidPasswordException {
		try {
			assertTrue(obj.isValidPasswordAccToRule("AsWqsD6!"));
		} catch (InvalidPasswordException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPasswordWhenWeUseLessThan8CharWithoutOneUpperCaseOneNumericValueAndOneSpecialChar_thenAssertionSad()
			throws Exception {
		try {
			assertTrue(obj.isValidPasswordAccToRule("AsfSA4s"));
		} catch (InvalidPasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}
