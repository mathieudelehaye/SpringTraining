package com.mdelehaye.beginspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};

@Configuration 
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Matthew";
	}
	
	@Bean
	public int age() {
		return 15; 
	}
	
	@Bean 
	public Person person() {
		var person = new Person("John", 20);
		return person;
	}
}
 