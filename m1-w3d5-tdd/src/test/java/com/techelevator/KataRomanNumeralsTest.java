package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {
private KataRomanNumerals romanNumerals;
	
	@Before
	public void setup(){
		romanNumerals = new KataRomanNumerals(); 
	}
	
	@Test
	public void one_returns_I(){
		Assert.assertEquals("I", romanNumerals.convertToRM(1));
	}
	
	@Test
	public void two_returns_II(){
		Assert.assertEquals("II", romanNumerals.convertToRM(2));
	}
	
	@Test
	public void three_returns_III(){
		Assert.assertEquals("III", romanNumerals.convertToRM(3));
	}
	
	@Test 
	public void four_returns_IV(){
		Assert.assertEquals("IV", romanNumerals.convertToRM(4));
	}
	
	@Test
	public void nine_returns_V(){
		Assert.assertEquals("V", romanNumerals.convertToRM(5));
	}
	
	@Test
	public void nine_returns_IX(){
		Assert.assertEquals("IX", romanNumerals.convertToRM(9));
	}
	
	@Test
	public void ten_returns_X(){
		Assert.assertEquals("X", romanNumerals.convertToRM(10));
	}
	
	@Test
	public void forty_returns_XL(){
		Assert.assertEquals("XL", romanNumerals.convertToRM(40));
	}
	
	@Test
	public void fifty_returns_L(){
		Assert.assertEquals("L", romanNumerals.convertToRM(50));
	}
	
	@Test
	public void ninety_returns_XC(){
		Assert.assertEquals("XC", romanNumerals.convertToRM(90));
	}
	
	@Test
	public void one_hundred_returns_C(){
		Assert.assertEquals("C", romanNumerals.convertToRM(100));
	}
	
	@Test
	public void four_hundred_returns_CD(){
		Assert.assertEquals("CD", romanNumerals.convertToRM(400));
	}
	
	@Test
	public void five_hundred_returns_D(){
		Assert.assertEquals("D", romanNumerals.convertToRM(500));
	}
	
	@Test
	public void nine_hundred_returns_CM(){
		Assert.assertEquals("CM", romanNumerals.convertToRM(900));
	}
	
	@Test
	public void one_thouseand_returns_M(){
		Assert.assertEquals("M", romanNumerals.convertToRM(1000));
	}
}
