package com.koreait.matzip.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class UserController {
	
	@RequestMapping(value="/login", method = RequestMethod.GET) // RequestMethod : get, post, put, delete
	public String login() {
		return "user/login";
	}
	
}
