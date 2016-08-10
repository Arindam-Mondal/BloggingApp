package com.blogging.application.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.blogging.application.model.UserLogin;
import com.blogging.application.services.LoginService;

@Controller
@RequestMapping("/application")
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("username") String username,@RequestParam("password") String password,Model model){
		
		logger.info("In loggin controller");
		try{
			UserLogin userLogin = this.loginService.getPasswordById(username);
			if(userLogin.getPassword().equals(password)){
				return "success";
			}else{
				return "login";
			}
		}catch(Exception e){
			logger.error(e.getMessage());
			return "login";
		}
		/*model.addAttribute("userLogin",this.loginService.getPasswordById(username));
		logger.info(this.loginService.getPasswordById(username).toString());
		return "login";*/
		
	}

}
