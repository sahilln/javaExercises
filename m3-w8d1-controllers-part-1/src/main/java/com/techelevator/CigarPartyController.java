package com.techelevator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CigarPartyController {

	@RequestMapping("/cigarPartyInput")
	public String showCigarPartyInput(){
		return "cigarPartyInput";
	}
	
	@RequestMapping("/cigarPartyResult")
	public String showCigarPartyResult(HttpServletRequest request){
		int squirrelNumber = Integer.parseInt(request.getParameter("squirrelNumber"));
		boolean isWeekend = request.getParameter("weekend") != null;
		String success = "";
		
		if(isWeekend && squirrelNumber >= 40){
			success = "true";
			request.setAttribute("isSuccessful", success);
		}
		else if(!isWeekend && squirrelNumber >= 40 && squirrelNumber <= 60){
			success = "true";
			request.setAttribute("isSuccessful", success);
		}
		else{
			success = "false";
			request.setAttribute("isSuccessful", success);
		}
			
		return "cigarPartyResult";
	}
}
