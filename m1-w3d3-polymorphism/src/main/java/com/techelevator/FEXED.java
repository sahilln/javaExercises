package com.techelevator;

public class FEXED implements DELIVERYDRIVERINTERFACE {

	@Override
	public double calculateRate(double distance, double weight) {
		if(distance > 500 && weight > 48){
			return 28.00;
		}
		if(distance > 500){
			return 25.00;
		}
		if(weight > 48){
			return 23.00;
		}
		return 20.00;
	}

	@Override
	public String getDeliveryMethod() {
		return "FexEd";
	}

}
