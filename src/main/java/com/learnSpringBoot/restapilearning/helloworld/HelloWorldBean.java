package com.learnSpringBoot.restapilearning.helloworld;

public class HelloWorldBean {
	
	private String message;
	private int sum;
	
	public HelloWorldBean() {
		
	}
	public HelloWorldBean(String message, int sum) {
		super();
		this.message = message;
		this.sum = sum;
	}
	public String getMessage() {
		return message;
	}
	public int getsum() {
		return sum;
	}
	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + ", sum=" + sum + "]";
	}
	
}
