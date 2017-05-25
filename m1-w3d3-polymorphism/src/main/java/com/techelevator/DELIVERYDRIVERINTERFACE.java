package com.techelevator;

public interface DELIVERYDRIVERINTERFACE {
	
	String getDeliveryMethod();
	double calculateRate(double distance, double weight);
	
}
