package com.ust.ExceptionHandlingPrj;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyExceptionsClass {
	
	private static Logger logger=LoggerFactory.getLogger(MyExceptionsClass.class);


	public static void main(String[] args) {
		
		logger.info("MyExceptionsClass started");
		int a,b;
		Scanner sc=new Scanner(System.in);
		logger.info("Reading a,b values");
		a=sc.nextInt();
		b=sc.nextInt();
		int res=0;
		try {
		 res=a/b;
		}
		catch(ArithmeticException ae) {
			logger.debug("Arithmetic exception occured due to value b {}",b);
			logger.info("Exception type is {}",ae);
		}
		logger.info("Result is {} ",res);
		
		logger.info("Application completed");
		
	}

}
