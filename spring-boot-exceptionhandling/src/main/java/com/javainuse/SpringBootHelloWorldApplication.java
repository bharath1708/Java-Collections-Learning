package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

import com.javainuse.controller.EmployeeController;
import com.javainuse.controller.Writer;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootHelloWorldApplication.class, args);

	        System.out.println("Application context initialized!!!");
	 
	}
}
