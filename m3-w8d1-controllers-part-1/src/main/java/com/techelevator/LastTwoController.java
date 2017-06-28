package com.techelevator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class LastTwoController {

	@RequestMapping("/lastTwoInput")
	public String showLastTwoInput(){
		return "lastTwoInput";
	}
	
	@RequestMapping("/lastTwoResult")
	public String showLastTwoResult(HttpServletRequest request){
		
		String newWord1 = switchLastTwo(request.getParameter("word1"));
		request.setAttribute("newWord1", newWord1);
		
		String newWord2 = switchLastTwo(request.getParameter("word2"));
		request.setAttribute("newWord2", newWord2);
		
		String newWord3 = switchLastTwo(request.getParameter("word3"));
		request.setAttribute("newWord3", newWord3);
		
		String newWord4 = switchLastTwo(request.getParameter("word4"));
		request.setAttribute("newWord4", newWord4);
		
		String newWord5 = switchLastTwo(request.getParameter("word5"));
		request.setAttribute("newWord5", newWord5);
		
		String newWord6 = switchLastTwo(request.getParameter("word6"));
		request.setAttribute("newWord6", newWord6);
		
		String newWord7 = switchLastTwo(request.getParameter("word7"));
		request.setAttribute("newWord7", newWord7);
		
		String newWord8 = switchLastTwo(request.getParameter("word8"));
		request.setAttribute("newWord8", newWord8);
		
		String newWord9 = switchLastTwo(request.getParameter("word9"));
		request.setAttribute("newWord9", newWord9);
		
		String newWord10 = switchLastTwo(request.getParameter("word10"));
		request.setAttribute("newWord10", newWord10);
		
		return "lastTwoResult";
		
	}
	
	public String switchLastTwo(String word){
		
 		char[] c = word.toCharArray();
		char temp = c[word.length()-2];
	    c[word.length()-2] = c[word.length()-1];
		c[word.length()-1] = temp;
		
		String newWord = new String(c);
		
		return newWord;
	}
}