package com.blogging.application.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.blogging.application.model.UserLogin;

@Repository
public class LoginDaoImpl implements LoginDao{
	
	private static final Logger logger = LoggerFactory.getLogger(LoginDaoImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}

	@Override
	public UserLogin getPasswordById(String id) {
		Session session = this.sessionFactory.getCurrentSession();
		UserLogin userLoginDetails = (UserLogin) session.load(UserLogin.class, new String(id));
		logger.info("User info retrieved successfully"+ userLoginDetails);
		return userLoginDetails;
	}
	

}
