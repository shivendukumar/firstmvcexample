package com.coursecube.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = { "com.coursecube.springboot" })
public class StartMyBootApp extends SpringBootServletInitializer{

	public static void main(String[] args) {
		System.out.println("My Boot App - main- begin");
		SpringApplication.run(StartMyBootApp.class, args);
		System.out.println("My Boot App - main- end");
	}
	
	@Bean
	public Hello getHello() {
		System.out.println(" getHello() ");
		return new Hello();
	}

}
