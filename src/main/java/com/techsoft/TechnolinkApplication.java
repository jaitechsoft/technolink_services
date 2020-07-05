package com.techsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.techsoft.technolink")
public class TechnolinkApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TechnolinkApplication.class, args);
		System.out.println("Technolink Application started with no error ::");
	}

}
