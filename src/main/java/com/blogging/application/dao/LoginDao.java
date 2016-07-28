package com.blogging.application.dao;

import com.blogging.application.model.UserLogin;

public interface LoginDao {
	public UserLogin getPasswordById(String id);
}
