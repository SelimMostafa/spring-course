package com.luv2code.springdemo;


public class PessimistFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is gonna be a shitty day because it's Sunday !";
	}

}
