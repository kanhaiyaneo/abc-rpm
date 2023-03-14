package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	
	
	
	@RequestMapping("/home")
	public String home()
	
	{
<<<<<<< HEAD
		
		
=======
		System.out.println("home new");
>>>>>>> 1e74010 (uploaded 1)
		return  "home section view";
	}
}
