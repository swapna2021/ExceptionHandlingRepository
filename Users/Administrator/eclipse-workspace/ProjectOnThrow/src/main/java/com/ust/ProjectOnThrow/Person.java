package com.ust.ProjectOnThrow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Person {
	
	private String name;
	private int id;
	private int age;
	
	private static Logger logger = LoggerFactory.getLogger(Person.class);
	
	public void checkAge() throws AgeNotSufficientException {
		
		if(age<18) {
			logger.debug("throwing AgeNotSufficientException because person age{} is less than 18",age);
			throw new AgeNotSufficientException("person age is less than 18");
		}
		else {
			System.out.println("Person is eligible to cast vote");
			logger.info("Person is eligible to cast vote");
		}
	}

}
