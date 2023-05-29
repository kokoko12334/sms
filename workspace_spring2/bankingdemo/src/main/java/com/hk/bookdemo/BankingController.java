package com.hk.bookdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankingController {
	
	@Autowired
	BankingFeign bankingFeign;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/jquery")
	public String test(){
		return "jquery";
	}
	
	@GetMapping("/ajax")
	public String test1() {
		return "ajax";
	}
	
	
	@GetMapping("/requesttoken")
	public String requesttoken(@RequestParam("code") String code,
			@RequestParam("scope") String scope,
			@RequestParam("state") String state){
		
		//  https://openapi.openbanking.or.kr/oauth/2.0/token
		//post
		// apllcation/x
		// code:
		//client_id:
		// client_secret=c3cb34d6-8b7d-4e3e-b2e7-aabf2f3d9f2d
		// redircet_url: 콜백
		// grant_type: authorization_code
		
		 
	      String client_id = "86dd1ec4-2394-4815-963f-0e5d2c28428a";
	      String client_secret = "c3cb34d6-8b7d-4e3e-b2e7-aabf2f3d9f2d";
	      String redirect_uri = "http://localhost/requesttoken";
	      String grant_type = "authorization_code";

		TokenResponseVO tokenResponseVO = bankingFeign.requestToken(code, 
				client_id, 
				client_secret, redirect_uri, grant_type);
		
		System.out.println(tokenResponseVO.toString());
		return "redirect:main";
		
	}
	
	@GetMapping("/main")
	public String main() {
		return "main";
	}
}
