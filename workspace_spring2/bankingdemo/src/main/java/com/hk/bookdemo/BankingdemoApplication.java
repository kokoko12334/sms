package com.hk.bookdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BankingdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingdemoApplication.class, args);
	}

}
