package com.bankapp.main.menu;

import org.apache.log4j.Logger;

import com.bankapp.exception.BusinessException;
import com.bankapp.main.Main;
import com.bankapp.model.User;
import com.bankapp.user.customer.service.CustomerLoginService;
import com.bankapp.user.customer.service.impl.CustomerLoginServiceImpl;

public class MenuLogic {
	private static CustomerLoginService customerLoginService = new CustomerLoginServiceImpl();
	private static Logger Log = Logger.getLogger(MenuLogic.class);
	PrintMenu menu = new PrintMenu();

	
	public User customerLogin(Scanner scanner) {
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
//				Log.info("Logging succesful");
			}
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
