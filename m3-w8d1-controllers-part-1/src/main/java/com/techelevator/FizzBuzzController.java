package com.techelevator;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FizzBuzzController {

	@RequestMapping("/fizzBuzzInput")
	public String showFizzBuzzInput() {
		return "fizzBuzzInput";
	}
	
	@RequestMapping("/fizzBuzzResult")
	public String showFizzBuzzResult(HttpServletRequest request){
		int d1 = Integer.parseInt(request.getParameter("divisableby1"));
		int d2 = Integer.parseInt(request.getParameter("divisableby2"));
		String aFizz = request.getParameter("altFizz");
		String aBuzz = request.getParameter("altBuzz");
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(Integer.parseInt(request.getParameter("number1")));
		numList.add(Integer.parseInt(request.getParameter("number2")));
		numList.add(Integer.parseInt(request.getParameter("number3")));
		numList.add(Integer.parseInt(request.getParameter("number4")));
		numList.add(Integer.parseInt(request.getParameter("number5")));
		
		List<String> fizzBuzz = new ArrayList<String>();
		
		for(int num: numList){
			if(num % d1 == 0 && num % d2 == 0){
				fizzBuzz.add(Integer.toString(num) + " " + aFizz + aBuzz);
			}
			else if(num % d1 == 0){
				fizzBuzz.add(Integer.toString(num) + " " + aFizz);
			}
			else if(num % d2 == 0){
				fizzBuzz.add(Integer.toString(num) + " " + aBuzz);
			}
			else{
				fizzBuzz.add(Integer.toString(num));
			}
		}
		request.setAttribute("fizzBuzzAlt", fizzBuzz);
	
	return "fizzBuzzResult";
	}
	
}
