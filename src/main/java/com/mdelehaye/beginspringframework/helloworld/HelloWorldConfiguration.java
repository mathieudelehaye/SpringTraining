package com.mdelehaye.beginspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

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
		return new Person("John", 20, new Address("Main Street", "Utrecht"));	
	}
	
	@Bean 
	public Person person2MethodCall() {
		return new Person(name(), age(), address());	
	}

	@Bean 
	public Person person3Parameters(String name, int age, Address address) {
		return new Person(name, age, address);	
	}
	
	@Bean 
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address);	
	}
	
	@Bean 
	public Person person5Qualifier(String name, int age, @Qualifier("address3Qualifier") Address address) {
		return new Person(name, age, address);	
	}

	@Bean(name= "address2")
	@Primary
	public Address address() {
		return new Address("48, Miller Street", "Glasgow");	 
	}

	@Bean(name= "address3")
	@Qualifier("address3Qualifier")
	public Address anotherAddress() {
		return new Address("5, South Frederick Street", "Edinburgh");	 
	}
}
 