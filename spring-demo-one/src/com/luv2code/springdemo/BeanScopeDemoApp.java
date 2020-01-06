package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach coach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		Boolean result = coach == alphaCoach;

		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for the coach: " + coach);
		System.out.println("\nMemory location for aplhaCoach: " + alphaCoach);
		
		context.close();

	}

}
