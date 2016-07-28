package com.blogging.application.services;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogging.application.dao.LoginDao;
import com.blogging.application.model.UserLogin;

@Service
public class LoginServiceImpl implements LoginService {
	
	private LoginDao loginDao;

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	@Transactional
	public UserLogin getPasswordById(String id) {
		
		return this.loginDao.getPasswordById(id);
	}
	
}
