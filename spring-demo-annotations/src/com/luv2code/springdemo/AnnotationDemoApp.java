package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		TennisCoach tennisCoach = (TennisCoach) theCoach;
		
		System.out.println("Tennis coach e-mail: "+tennisCoach.getEmail());
		System.out.println("Tennis coach team: "+tennisCoach.getTeam());
		
		context.close();

	}

}
