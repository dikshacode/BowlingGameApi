package com.bowling.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.bowlingdesign"})
public class BowlingDesign {

	public static void main(String[] args) {
		SpringApplication.run(BowlingDesign.class, args);
	}

}
