package com.blz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntriesUserRegistration {

	// Method for first name validation
	public void isValidFirstName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your First name : ");
		String fname = sc.nextLine();
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fname);
		boolean match = matcher.matches();
		System.out.println("First name : " + fname + " is " + match);
	}

	// Method for second name validation
	public void isValidSecondName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Last name : ");
		String lname = sc.nextLine();
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lname);
		boolean match = matcher.matches();
		System.out.println("Last name : " + lname + " is " + match);
	}

	// Method for email validation
	public void isValidEmail() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your email : ");
		String email = sc.nextLine();
		String regex = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		boolean match = matcher.matches();
		System.out.println("Email : " + email + " is " + match);
	}

	// Method for mobileNo validation
	public void isValidMobileNo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your mobileNo : ");
		String mobileNo = sc.nextLine();
		String regex = "^[9][1][: :]{1}[6-9]{1}[0-9]{9}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobileNo);
		boolean match = matcher.matches();
		System.out.println("MobileNo : " + mobileNo + " is " + match);
	}

	// Method for Password validation a/c to rule1
	public void isValidPasswordAccToRule1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter min 8 char any password : ");
		String password = sc.nextLine();
		String regex = "^[a-zA-Z0-9@#!]{8}[a-zA-z0-9@#!]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		boolean match = matcher.matches();
		System.out.println("Password : " + password + " is " + match);
	}

}
