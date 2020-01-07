package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Puch him in the face";
	}

}
