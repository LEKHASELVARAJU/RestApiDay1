package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Ex_2 {
	private String name="LEKHA";
	@GetMapping("name")
	public String getName()
	{
		return "Welcome "+getMyName()+"!";
	}
	public String getMyName()
	{
		return name;
	}

}
