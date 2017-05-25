package com.techelevator;

public class Car implements Vehicle {

	private boolean trailer;
	
	public Car(boolean trailer){
		this.trailer = trailer;
	}
	
	@Override
	public double calculateToll(int distance) {
		if (trailer){
			return (distance * 0.02) + 1.00;
		}
		else{
			return distance * 0.02;
		}
	}

	@Override
	public String getVehicleType() {
		if(trailer){
			return "Car w/ Trailer";
		}
		else{
			return "Car";
		}
	}
}