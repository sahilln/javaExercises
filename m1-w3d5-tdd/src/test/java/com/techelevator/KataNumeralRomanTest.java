package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KataNumeralRomanTest {
private KataNumeralRoman numeralRoman;
	
	@Before
	public void setup(){
		numeralRoman = new KataNumeralRoman(); 
	}
	
	@Test
	public void I_returns_1(){
		Assert.assertEquals((Integer)1, numeralRoman.romanToDecimal("I"));
	}
	
	@Test
	public void V_returns_5(){
		Assert.assertEquals((Integer)5, numeralRoman.romanToDecimal("V"));
	}
	
	@Test
	public void X_returns_10(){
		Assert.assertEquals((Integer)10, numeralRoman.romanToDecimal("X"));
	}
	
	@Test
	public void L_returns_50(){
		Assert.assertEquals((Integer)50, numeralRoman.romanToDecimal("L"));
	}
	
	@Test
	public void C_returns_100(){
		Assert.assertEquals((Integer)100, numeralRoman.romanToDecimal("C"));
	}
	
	@Test
	public void D_returns_500(){
		Assert.assertEquals((Integer)500, numeralRoman.romanToDecimal("D"));
	}
	
	@Test
	public void M_returns_1000(){
		Assert.assertEquals((Integer)1000, numeralRoman.romanToDecimal("M"));
	}
}
