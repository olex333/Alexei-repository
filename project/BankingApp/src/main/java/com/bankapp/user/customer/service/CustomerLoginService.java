package com.bankapp.user.customer.service;

import com.bankapp.exception.BusinessException;
import com.bankapp.model.User;

public interface CustomerLoginService {
	
	public User LogIn(User user) throws BusinessException;

}
