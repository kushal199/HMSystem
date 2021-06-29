package com.hms.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class Home {

	@GetMapping("/")
	public String hello() {
		return "This is Home page";
	}


}
