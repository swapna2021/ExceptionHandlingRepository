package com.ust.ProjectOnThrow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
	
	private static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
    	logger.info("Application started");
        Person p=new Person("Swapna",123,13);
        logger.info("Object create to Person {}",p);
        System.out.println(p);
        try {
        	logger.info("Invoking person checkAge method");
        	p.checkAge();
        }
        catch(AgeNotSufficientException ase) {
        	logger.debug("Catching AgeNotSufficientException :{}",ase);
        	System.out.println("Person age is not sufficient to cast vote"+ase);
        }
        finally{
        	logger.info("Person app completed");
        }
       
    }
}
