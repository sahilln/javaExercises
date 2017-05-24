package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SmartPhoneTest {
	private SmartPhone mySmartPhone;
	
	@Before
	public void setup(){
		mySmartPhone = new SmartPhone("859", "ATT");
	}
	
	@Test
	public void smartphone_initializes_correctly(){
		Assert.assertEquals("859", mySmartPhone.getPhoneNumber());
		Assert.assertEquals("ATT", mySmartPhone.getCarrier());
		Assert.assertEquals("iOS", mySmartPhone.getOperatingSystem());
		Assert.assertEquals(false, mySmartPhone.isOnCall());
		Assert.assertEquals(100, mySmartPhone.getBatteryCharge());
	}
	
	@Test
	public void able_to_set_operating_system(){
		mySmartPhone.setOperatingSystem("Android");
		Assert.assertEquals("Android", mySmartPhone.getOperatingSystem());
	}
	
	@Test
	public void able_to_call(){
		Assert.assertTrue(mySmartPhone.Call("859", 60));
	}
	
	@Test
	public void able_to_answer_phone(){
		mySmartPhone.AnswerPhone();
		Assert.assertTrue(mySmartPhone.isOnCall());
	}
	
	@Test
	public void able_to_hang_up(){
		mySmartPhone.AnswerPhone();
		mySmartPhone.HangUp();
		Assert.assertFalse(mySmartPhone.isOnCall());
	}
	@Test
	public void able_to_recharge_battery(){
		int charge = mySmartPhone.getBatteryCharge();
		charge -= 50;
		mySmartPhone.RechargeBattery();
		Assert.assertEquals(100, mySmartPhone.getBatteryCharge());
	}
}
