package com.scanncook;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScannCookBackApplication {
	private static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {

		SpringApplication.run(ScannCookBackApplication.class, args);
		}

}
