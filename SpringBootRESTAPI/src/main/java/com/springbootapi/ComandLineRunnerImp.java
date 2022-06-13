package com.springbootapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

public class ComandLineRunnerImp implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("In CommandLineRunner");
		
		for(String s : args)
			System.out.println(s);
	}

}
