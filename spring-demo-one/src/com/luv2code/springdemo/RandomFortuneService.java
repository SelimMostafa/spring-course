package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	public static int generateRandomIntIntRange(int min, int max) {

	    Random r = new Random();

	    return r.nextInt((max - min) + 1) + min;

	}

	@Override
	public String getFortune() {

		String[] fortunes = { "Change yourself and fortune will change.",
				"Good things come when you least expect them.",
				"Great actions are not always true sons of great and mighty resolutions." };
		
		return fortunes[generateRandomIntIntRange(0, 2)];
		
	}

}
