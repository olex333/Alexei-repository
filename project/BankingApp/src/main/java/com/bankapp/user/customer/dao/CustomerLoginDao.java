package com.bankapp.user.customer.dao;

import com.bankapp.exception.BusinessException;
import com.bankapp.model.User;

public interface CustomerLoginDao {
	
	public User LogIn(String username, String password) throws BusinessException;


}
