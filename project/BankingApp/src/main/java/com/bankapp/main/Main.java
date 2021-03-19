package com.bankapp.main;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.bankapp.exception.BusinessException;
import com.bankapp.main.menu.PrintMenu;
import com.bankapp.model.User;
import com.bankapp.user.customer.service.CustomerLoginService;
import com.bankapp.user.customer.service.impl.CustomerLoginServiceImpl;

import jdk.internal.org.jline.utils.Log;



public class Main {
	private static CustomerLoginService customerLoginService = new CustomerLoginServiceImpl();
	private static Logger Log = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		Log.info("Welcome to the Alexei bank"
				+ " app V1.0");
		Log.info("================");
		PrintMenu menu = new PrintMenu();
		
		int ch = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
//			Log.info("Are you a employee or customer?");//
			menu.printUserMenu();
			try {
				ch = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {

			}
			
			switch (ch) {
			case 1:
				menu.printCustomerLoginMenu();
				User user = new User();
				Log.info("Enter username: ");
				user.setUsername( scanner.nextLine());
				Log.info("Enter password: ");
				user.setPassword(scanner.nextLine());
				User user1;
				try {
					user1 = customerLoginService.LogIn(user);
					if(user1 != null) {
//						Log.info("Logging succesful");
					}
				} catch (BusinessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				Log.info("Under Construction");
				break;
				
			case 3:
				Log.info("Thank you for using our banking app,"
						+ " Hope you to see you again in the future");
				break;
				
			default:
				Log.info("Invalid Choice... Please enter a proper choice between 1-3 only.......");
			}
			
		} while (ch != 3);
		
		
	}

}
