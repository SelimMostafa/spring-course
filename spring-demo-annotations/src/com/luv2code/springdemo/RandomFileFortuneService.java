package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RandomFileFortuneService implements FortuneService {

	private List<String> fortunes;

	public RandomFileFortuneService()  {

	}

	@PostConstruct
	private void readRandomFortunes() throws IOException {
		File file = new File("src/randomfortunes.txt");

		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

		fortunes = new ArrayList<String>();
		String fortune;

		while ((fortune = bufferedReader.readLine()) != null)
			fortunes.add(fortune);

		bufferedReader.close();

	}

	@Override
	public String getFortune() {

		return pickRandomFortune();
	}

	private String pickRandomFortune() {

		Random random = new Random();

		int index = random.nextInt(fortunes.size());

		return fortunes.get(index);

	}

}
