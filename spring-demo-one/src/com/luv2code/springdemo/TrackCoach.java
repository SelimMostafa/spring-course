package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "run a hard 5k";
	}

	@Override
	public String getDailyFortune() {

		return "Just Do It: " + fortuneService.getFortune();
	}

	private void doMyStartupStuff() {

		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}

	private void doMyCleanupStuffYoYo() {

		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}

}
