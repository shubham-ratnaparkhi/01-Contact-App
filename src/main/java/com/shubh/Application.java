package com.shubh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.shubh.config.SwaggerConfig;


@SpringBootApplication
@ComponentScan(basePackageClasses = {Application.class, SwaggerConfig.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Starting project...");
	}

}