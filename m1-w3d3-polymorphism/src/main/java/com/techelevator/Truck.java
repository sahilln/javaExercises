	package com.techelevator;

public class Truck implements Vehicle {

	private int axles;
	
	public Truck(int axles){
		this.axles = axles;
	}

	@Override
	public double calculateToll(int distance) {
		if(axles == 4){
			return 0.040 * distance;
		}
		if(axles == 6){
			return 0.045 * distance;
		}
		if(axles >= 8){
			return 0.048 * distance;
		}
		return 0.0;
	}

	@Override
	public String getVehicleType() {
		if(axles == 4){
			return "Truck with 4 axles";
		}
		if(axles == 6){
			return "Truck with 6 axles";
		}
		if(axles >= 8){
			return "Truck with 8 or more axles";
		}
		return " ";
	}
	
}
