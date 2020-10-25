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
}
