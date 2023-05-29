package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.nurigo.mavenspringdemo.ExampleController;
import net.nurigo.sdk.message.response.SingleMessageSentResponse;

@Controller
public class Test {

	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	
	
	
	
	
	
	
	
}
