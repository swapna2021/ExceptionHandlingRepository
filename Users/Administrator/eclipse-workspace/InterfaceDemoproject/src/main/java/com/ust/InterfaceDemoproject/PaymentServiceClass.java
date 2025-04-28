package com.ust.InterfaceDemoproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaymentServiceClass implements Payable,Audiatable {
	
	Logger logger=LoggerFactory.getLogger(this.getClass());

	@Override
	public void audit(int transactionId, double amount) {
		
		logger.info("Aduditing started");
		if(transactionId<=0)
			logger.error("invalid transaction id");
		else
			logger.info("audit completed for the transaction id {} "
					+ "with the amount {}",transactionId,amount);
		
	}

	@Override
	public void processingPayment(double amount) {
		
		logger.info("processing payment of {} amount",amount);
		if(amount<=0) {
			logger.error("invalid payment amount : {}",amount);
		}
		else
			logger.info("payment of {} amount done successfully",amount);
		
	}

}
