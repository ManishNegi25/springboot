package com.cetpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cetpa.services.UserService;

@Controller
@RequestMapping("cetpa-bank/user")
public class UserController 
{
@Autowired
 public UserService userService;

@RequestMapping("login")
public String getLoginView()
{
	 return "user/user-login";
}
}
