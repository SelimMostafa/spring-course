package com.luv2code.springdemo;


public class FootballCoach implements Coach {
	
	
	
	FortuneService fortuneService;
	

	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "pass to Selim and wait for the GOAL!";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
