package com.blz.userregistration;

public class UserRegistration {

	public static void main(String args[]) {
		EntriesUserRegistration ur = new EntriesUserRegistration();
		// First name validation
		ur.isValidFirstName();
		// Second name validation
		ur.isValidSecondName();
		// Email validation
		ur.isValidEmail();
		// MobileNo validation
		ur.isValidMobileNo();
		// Password validation a/c to rule1
		ur.isValidPasswordAccToRule1();
	}
}
