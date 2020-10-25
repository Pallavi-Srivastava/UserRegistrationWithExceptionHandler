package com.blz.validateuserregistration;

import java.util.regex.Pattern;

public class ValidateUserRegistration {

	// Method for first name validation
	public String isValidFirstName(String fname) throws Exception {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		try {
			if (p.matcher(fname).matches())
				return "Matched";
		} catch (Exception e) {
			throw new InvalidUserDetailsEx("Invalid User first name....please try it once : ");
		}
		return "UnMatched";
	}

	// Method for Last name validation
	public String isValidLastName(String lname) throws Exception {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		try {
			if (p.matcher(lname).matches())
				return "Matched";
		} catch (Exception e) {
			throw new InvalidUserDetailsEx("Invalid User last name....please try it once : ");
		}
		return "UnMatched";
	}

	// Method for email validation
	public String isValidEmail(String mail) throws Exception {
		String regex = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
		Pattern p = Pattern.compile(regex);
		try {
			if (p.matcher(mail).matches())
				return "Matched";
		} catch (Exception e) {
			throw new InvalidUserDetailsEx("Invalid User email....please try it once : ");
		}
		return "UnMatched";
	}

	// Method for MobileNo validation
	public String isValidMobileNo(String mobileNo) throws Exception {
		String regex = "^[9][1][: :]{1}[6-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(regex);
		try {
			if (p.matcher(mobileNo).matches())
				return "Matched";
		} catch (Exception e) {
			throw new InvalidUserDetailsEx("Invalid User MobileNo....please try it once : ");
		}
		return "UnMatched";
	}

	// Method for Password validation a/c to rule 1
	public String isValidPasswordAccToRule1(String password) throws Exception {
		String regex = "^[a-zA-Z0-9@#!]{8}[a-zA-z0-9@#!]*";
		Pattern p = Pattern.compile(regex);
		try {
			if (p.matcher(password).matches())
				return "Matched";
		} catch (Exception e) {
			throw new InvalidUserDetailsEx("Invalid User Password....please try it once : ");
		}
		return "UnMatched";
	}

	// Method for Password validation a/c to rule 2
	public String isValidPasswordAccToRule2(String password) throws Exception {
		String regex = "^[a-zA-Z0-9@#!]{7}[A-Z]{1}[A-Z]*";
		Pattern p = Pattern.compile(regex);
		try {
			if (p.matcher(password).matches())
				return "Matched";
		} catch (Exception e) {
			throw new InvalidUserDetailsEx("Invalid User Password....please follow the password pattern : ");
		}
		return "UnMatched";
	}

	// Method for Password validation a/c to rule 3
	public String isValidPasswordAccToRule3(String password) throws Exception {
		String regex = "^[a-zA-Z0-9@#!]{6}[A-Z]{1}[[A-Z]]*[0-9]{1}[0-9]*";
		Pattern p = Pattern.compile(regex);
		try {
			if (p.matcher(password).matches())
				return "Matched";
		} catch (Exception e) {
			throw new InvalidUserDetailsEx("Invalid User Password....please follow the password pattern : ");
		}
		return "UnMatched";
	}

	// Method for Password validation a/c to rule 4
	public String isValidPasswordAccToRule4(String password) throws Exception {
		String regex = "^[a-zA-Z0-9@#%!]{5}[A-Z]{1}[A-Z]*[0-9]{1}[0-9]*[@#%!]{1}[@#%!]*";
		Pattern p = Pattern.compile(regex);
		try {
			if (p.matcher(password).matches())
				return "Matched";
		} catch (Exception e) {
			throw new InvalidUserDetailsEx("Invalid User Password....please follow the password pattern : ");
		}
		return "UnMatched";
	}
}
