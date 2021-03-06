package com.bankapp.user.customer.service;

public class CustomerValidations {
	
	public static boolean isValidUserName(String name) {
		if (name != null && name.matches("[a-zA-Z0-9]{5,20}")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isValidPassword(String name) {
		if (name != null && name.matches("[a-zA-Z0-9]{8,20}")) {
			return true;
		} else {
			return false;
		}
	}

}
