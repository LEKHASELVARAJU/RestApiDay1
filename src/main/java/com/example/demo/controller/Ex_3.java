package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex_3 {
//	Ex_3.favCol("Blue");
	private String fav="Blue";
	@GetMapping("colour")
	public String getMyFav()
	{
		return "My favourite colour is "+fav;
	}

}
