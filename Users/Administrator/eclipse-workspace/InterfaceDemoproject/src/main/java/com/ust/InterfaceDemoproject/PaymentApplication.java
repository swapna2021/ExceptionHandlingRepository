package com.ust.InterfaceDemoproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaymentApplication {
	
	private static Logger logger=LoggerFactory.getLogger(PaymentApplication.class);
	
	public static void main(String[] args) {
		
		logger.info("Payment Application started");
		
		PaymentServiceClass psc=new PaymentServiceClass();
		
		psc.processingPayment(2000);
		psc.audit(-31,4500);
		
		
	}

}
