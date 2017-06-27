package com.techelevator;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ColorizedNameController {

	@RequestMapping("/colorizedNameInput")
	public String showColorizedNameInput() {
		return "colorizedNameInput";
	}
	
	@RequestMapping("/colorizedNameResult")
	public String showColorizedNameResult(HttpServletRequest request){
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String colors[] = request.getParameterValues("color");
		
		if(Arrays.asList(colors).contains("Red")){
			request.setAttribute("redName", firstName+ " " + lastName);
		}
		if(Arrays.asList(colors).contains("Blue")){
			request.setAttribute("blueName", firstName+ " " + lastName);
		}
		if(Arrays.asList(colors).contains("Green")){
			request.setAttribute("greenName", firstName+ " " + lastName);
		}
		
		return "colorizedNameResult";
		
	}
}
