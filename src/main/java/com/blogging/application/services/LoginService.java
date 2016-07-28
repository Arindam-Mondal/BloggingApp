package com.blogging.application.services;

import com.blogging.application.model.UserLogin;

public interface LoginService{

	public UserLogin getPasswordById(String id);

}
