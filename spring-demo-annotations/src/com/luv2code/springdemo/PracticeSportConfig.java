package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class PracticeSportConfig {
	
	@Bean
	FortuneService pessimistFortuneService() {
		return new PessimistFortuneService();
	}
	
	@Bean
	Coach footballCoach() {
		return new FootballCoach(pessimistFortuneService());
	}

}
