package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Menucontroller {

	@RequestMapping("/")
	public String Home()
	{
		return "Home.html";
	}

}
