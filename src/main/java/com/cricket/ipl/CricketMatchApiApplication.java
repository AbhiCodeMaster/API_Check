package com.cricket.ipl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class CricketMatchApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketMatchApiApplication.class, args);
		Logger logger = LoggerFactory.getLogger(CricketMatchApiApplication.class);
		logger.info("hi my self abhinav chauhan");
	}

}
