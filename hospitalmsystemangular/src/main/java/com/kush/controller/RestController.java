package com.kush.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kush.modal.User;
import com.kush.services.UserService;


@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String hello() {
		return "This is Home page";
	}
	
//	@GetMapping("/saveuser")
//	public String saveUser(@RequestParam String firstname, @RequestParam String lastname, @RequestParam String username,@RequestParam String password) {
//		//User user = new User(firstname,lastname,username, password);
//		userService.saveUser(user);
//		return "User Saved";
//	}
//	

}
