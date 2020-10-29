package com.blz.validateuserregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}";
	public static final String lastNamePattern = "^[A-Z]{1}[a-z]{2,}";
	public static final String emailPattern = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
	public static final String mobileNoPattern = "^[9][1][: :]{1}[6-9]{1}[0-9]{9}$";
	public static final String passwordPattern = "^[a-zA-Z0-9@#%!]{5}[A-Z]{1}[A-Z]*[0-9]{1}[0-9]*[@#%!]{1}[@#%!]*";

	UserRegistrationInf obj = (userDetailsPattern, details) -> {
		Pattern p = Pattern.compile(userDetailsPattern);
		Matcher m = p.matcher(details);
		return m.matches();
	};

	// Method for first name validation
	public boolean isValidFirstName(String firstName) throws InvalidFirstNameException {
		try {
			if (obj.validate(firstNamePattern, firstName))
				return true;
			else {
				throw new InvalidFirstNameException("Invalid User first name : ");
			}
		} catch (Exception e) {
			throw new InvalidFirstNameException("Invalid User first name : ");
		}
	}

	// Method for last name validation
	public boolean isValidLastName(String lastName) throws InvalidLastNameException {
		try {
			if (obj.validate(lastNamePattern, lastName))
				return true;
			else {
				throw new InvalidLastNameException("Invalid User last name : ");
			}
		} catch (Exception e) {
			throw new InvalidLastNameException("Invalid User last name : ");
		}
	}

	// Method for first name validation
	public boolean isValidEmail(String email) throws InvalidEmailException {
		try {
			if (obj.validate(emailPattern, email))
				return true;
			else {
				throw new InvalidEmailException("Invalid User email : ");
			}
		} catch (Exception e) {
			throw new InvalidEmailException("Invalid User email : ");
		}
	}

	// Method for last name validation
	public boolean isValidMobileNo(String mobileNo) throws InvalidMobileNoException {
		try {
			if (obj.validate(mobileNoPattern, mobileNo))
				return true;
			else {
				throw new InvalidMobileNoException("Invalid User MobileNo : ");
			}
		} catch (Exception e) {
			throw new InvalidMobileNoException("Invalid User MobileNo : ");
		}
	}

	// Method for Password validation a/c to rule 4
	public boolean isValidPasswordAccToRule(String password) throws InvalidPasswordException {
		try {
			if (obj.validate(passwordPattern, password))
				return true;
			else {
				throw new InvalidPasswordException("Invalid User Password : ");
			}
		} catch (Exception e) {
			throw new InvalidPasswordException("Invalid User Password : ");
		}
	}
}
