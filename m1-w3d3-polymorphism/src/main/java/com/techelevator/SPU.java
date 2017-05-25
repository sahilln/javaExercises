package com.techelevator;

public class SPU implements DELIVERYDRIVERINTERFACE {

	private String service;
	private String unit;
	
	public SPU(String service, String unit){
		this.service = service;
		this.unit = unit;
	}
	
	@Override
	public double calculateRate(double distance, double weight) {
		if (unit.equalsIgnoreCase("O")){
			weight = weight/16; 
			if (service.equals("4-day ground")){
				return (weight * 0.0050) * distance;
			}
			if(service.equals("2-day business")){
				return (weight * 0.050) * distance;
			}
			if(service.equalsIgnoreCase("next day")){
				return (weight * 0.075) * distance;
			}
			return 0.00;
		}
		else{
			if (service.equals("4-day ground")){
				return (weight * 0.0050) * distance;
			}
			if(service.equals("2-day business")){
				return (weight * 0.050) * distance;
			}
			if(service.equalsIgnoreCase("next day")){
				return (weight * 0.075) * distance;
			}
			return 0.00;
		}
	}

	@Override
	public String getDeliveryMethod() {
		if(service.equals("4-day ground")){
			return "SPU (4-day ground)";
		}
		else if(service.equals("2-day business")){
			return "SPU (2-day business)";
		}
		else if(service.equals("next day")){
			return "SPU (next-day)";
		}
		return null;
	}
	

}
