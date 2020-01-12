package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		SwimCoach theSwimCoach = (SwimCoach) theCoach ;
		
		System.out.println("Swim coach e-mail: "+theSwimCoach.getEmail());
		System.out.println("Swim coach team: "+theSwimCoach.getTeam());
		
		
		
		context.close();

	}

}
