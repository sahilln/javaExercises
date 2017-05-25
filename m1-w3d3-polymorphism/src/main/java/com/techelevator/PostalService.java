package com.techelevator;

public class PostalService implements DELIVERYDRIVERINTERFACE{

	private String service;
	private String unit;
	
	public PostalService(String service, String unit){
		this.service = service;
		this.unit = unit;
	}

	@Override
	public double calculateRate(double distance, double weight) {
		double perMileRate = 0;
		if(unit.equalsIgnoreCase("P")){
			weight = weight * 16;
			if(service.equals("1st Class")){
				if(weight >= 0 && weight <= 2){
					perMileRate = 0.035;
				}
				else if(weight >= 3 && weight <= 8){
					perMileRate = 0.040;
				}
				else if(weight >= 9 && weight <= 15){
					perMileRate = 0.047;
				}
				else if(weight > 15 && weight <= 64){
					perMileRate = 0.195;
				}
				else if(weight > 64 && weight <= 144){
					perMileRate = 0.450;
				}
				else{
					perMileRate = 0.500;
				}
			}
			if(service.equals("2nd Class")){
				if(weight >= 0 && weight <= 2){
					perMileRate = 0.0035;
				}
				else if(weight >= 3 && weight <= 8){
					perMileRate = 0.0040;
				}
				else if(weight >= 9 && weight <= 15){
					perMileRate = 0.0047;
				}
				else if(weight > 15 && weight <= 64){
					perMileRate = 0.0195;
				}
				else if(weight > 64 && weight <= 144){
					perMileRate = 0.0450;
				}
				else{
					perMileRate = 0.0500;
				}
			}
			if(service.equals("3rd Class")){
				if(weight >= 0 && weight <= 2){
					perMileRate = 0.0020;
				}
				else if(weight >= 3 && weight <= 8){
					perMileRate = 0.0022;
				}
				else if(weight >= 9 && weight <= 15){
					perMileRate = 0.0024;
				}
				else if(weight > 15 && weight <= 64){
					perMileRate = 0.0150;
				}
				else if(weight > 64 && weight <= 144){
					perMileRate = 0.0160;
				}
				else{
					perMileRate = 0.0170;
				}
			}
		}
		else{
			if(service.equals("1st Class")){
				if(weight >= 0 && weight <= 2){
					perMileRate = 0.035;
				}
				else if(weight >= 3 && weight <= 8){
					perMileRate = 0.040;
				}
				else if(weight >= 9 && weight <= 15){
					perMileRate = 0.047;
				}
				else if(weight > 15 && weight <= 64){
					perMileRate = 0.195;
				}
				else if(weight > 64 && weight <= 144){
					perMileRate = 0.450;
				}
				else{
					perMileRate = 0.500;
				}
			}
			if(service.equals("2nd Class")){
				if(weight >= 0 && weight <= 2){
					perMileRate = 0.0035;
				}
				else if(weight >= 3 && weight <= 8){
					perMileRate = 0.0040;
				}
				else if(weight >= 9 && weight <= 15){
					perMileRate = 0.0047;
				}
				else if(weight > 15 && weight <= 64){
					perMileRate = 0.0195;
				}
				else if(weight > 64 && weight <= 144){
					perMileRate = 0.0450;
				}
				else{
					perMileRate = 0.0500;
				}
			}
			if(service.equals("3rd Class")){
				if(weight >= 0 && weight <= 2){
					perMileRate = 0.0020;
				}
				else if(weight >= 3 && weight <= 8){
					perMileRate = 0.0022;
				}
				else if(weight >= 9 && weight <= 15){
					perMileRate = 0.0024;
				}
				else if(weight > 15 && weight <= 64){
					perMileRate = 0.0150;
				}
				else if(weight > 64 && weight <= 144){
					perMileRate = 0.0160;
				}
				else{
					perMileRate = 0.0170;
				}
			}
		}
		return perMileRate * distance; 
	}

	@Override
	public String getDeliveryMethod() {
		if(service.equals("1st Class")){
			return "Postal Service (1st Class)";
		}
		else if(service.equals("2nd Class")){
			return "Postal Service (2nd Class)";
		}
		else if(service.equals("3rd Class")){
			return "Postal Service (3rd Class)";
		}
		return null;
	}
	
}
