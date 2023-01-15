package com.learnSpringBoot.restapilearning.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldResource {
	
	@RequestMapping("/say-hello")
	public String sayHelloToTheWorld() {
		return "Hello World";
	}
	
	
	@RequestMapping("/path-param/{message}")
	public String sayHelloToTheWorldPath(@PathVariable String message) {
		return "Hello World " + message;
	}
	
	@RequestMapping("/riya")
	public HelloWorldBean sayHelloToTheWorldPathBean() {
		return new HelloWorldBean("Hello I am bean!", 1001);
	}
	
	@RequestMapping("/add/{no1}/{no2}")
	public HelloWorldBean addTwoNumbers(@PathVariable int no1, @PathVariable int no2) {
		return new HelloWorldBean("Hello I am bean!", (no1+no2));
	}
}
