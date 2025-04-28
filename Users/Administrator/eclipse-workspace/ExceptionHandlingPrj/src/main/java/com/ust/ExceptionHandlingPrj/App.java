package com.ust.ExceptionHandlingPrj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
	
	private static Logger logger=LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
    	
    	logger.info("Application Started");
    	
    	String str=null;
    	try {
    	str.equals("swapna");
    	}
    	
    	
    	catch(NullPointerException n) {
    		logger.info("null pointer exception occured {} ",n);
    		n.printStackTrace();
    	}
    	catch(RuntimeException r) {
    		logger.error("Runtime Exception occured {} ",r);
    		r.printStackTrace();
    	}
    	catch(Exception e) {
    		logger.error("Exception occured {} ",e);
    	}
    	
    	finally {
    		logger.info("Finally block executed");
    	}
    	
    	logger.info("Apllication completed");
       
    }
}
