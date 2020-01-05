package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach bean = (CricketCoach) context.getBean("myCoach",Coach.class);
		
		System.out.println(bean.getDailyWorkout());
		System.out.println(bean.getDailyFortune());
		System.out.println(bean.getEmail());
		System.out.println(bean.getTeam());
		
		
		context.close();
		
	}

}
