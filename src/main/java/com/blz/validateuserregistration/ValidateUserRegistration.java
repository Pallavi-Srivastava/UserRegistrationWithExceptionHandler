package com.blz.validateuserregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserRegistration {

	// Method for first name validation
	public boolean isValidFirstName(String fname) {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(fname);
		return m.matches();
	}

	// Method for first name validation
	public boolean isValidLastName(String lname) {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lname);
		return m.matches();
	}

	// Method for email validation
	public boolean isValidEmail(String mail) {
		String regex = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mail);
		return m.matches();
	}

	// Method for MobileNo validation
	public boolean isValidMobileNo(String mobileNo) {
		String regex = "^[9][1][: :]{1}[6-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mobileNo);
		return m.matches();
	}

	// Method for Password validation a/c to rule 1
	public boolean isValidPasswordAccToRule1(String password) {
		String regex = "^[a-zA-Z0-9@#!]{8}[a-zA-z0-9@#!]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(password);
		return m.matches();
	}

	// Method for Password validation a/c to rule 2
	public boolean isValidPasswordAccToRule2(String password) {
		String regex = "^[a-zA-Z0-9@#!]{7}[A-Z]{1}[A-Z]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(password);
		return m.matches();
	}

	// Method for Password validation a/c to rule 3
	public boolean isValidPasswordAccToRule3(String password) {
		String regex = "^[a-zA-Z0-9@#!]{6}[A-Z]{1}[[A-Z]]*[0-9]{1}[0-9]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(password);
		return m.matches();
	}

	// Method for Password validation a/c to rule 4
	public boolean isValidPasswordAccToRule4(String password) {
		String regex = "^[a-zA-Z0-9@#%!]{5}[A-Z]{1}[A-Z]*[0-9]{1}[0-9]*[@#%!]{1}[@#%!]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(password);
		return m.matches();
	}
}
