package com.blz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	// Method for first name validation
	public String isValidFirstName(String fname) {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(fname);
		if (p.matcher(fname).matches())
			return "Matched";
		else
			return "UnMatched";
	}

	// Method for last name validation
	public String isValidLastName(String lname) {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lname);
		if (p.matcher(lname).matches())
			return "Matched";
		else
			return "UnMatched";
	}

	// Method for email validation
	public String isValidEmail(String mail) {
		String regex = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mail);
		if (p.matcher(mail).matches())
			return "Matched";
		else
			return "UnMatched";
	}

	// Method for MobileNo validation
	public String isValidMobileNo(String mobileNo) {
		String regex = "^[9][1][: :]{1}[6-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mobileNo);
		if (p.matcher(mobileNo).matches())
			return "Matched";
		else
			return "UnMatched";
	}
}
