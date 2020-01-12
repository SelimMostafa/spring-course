package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFileFortuneService")
	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;

	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {

		this.fortuneService = fortuneService;

	}

	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
		this.fortuneService = fortuneService;
	}*/
	@PostConstruct
	private void doMyStartupStuff() {

		System.out.println("TennisCoach: inside method doMyStartupStuff()");
	}
	
	@PreDestroy
	private void doMyCleanupStuff() {

		System.out.println("TennisCoach: inside method doMyCleanupStuff()");
	}

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	

}
