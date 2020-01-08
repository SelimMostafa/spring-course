package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach {
	
	private FortuneService fortuneService;

	@Autowired
	public BoxingCoach(@Qualifier("randomFileFortuneService")FortuneService fortuneService) {

		this.fortuneService = fortuneService;

	}

	@Override
	public String getDailyWorkout() {
		
		return "Puch him in the face";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
