package com.blogging.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignUpController {
	
	@RequestMapping(value="/register")
	public String register(){
		return "register";
	}

}
