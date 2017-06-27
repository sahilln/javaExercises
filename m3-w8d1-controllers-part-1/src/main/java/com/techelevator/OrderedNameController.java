package com.techelevator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderedNameController {

		@RequestMapping("/orderedNameInput")
		public String showOrderedNameInput() {
			return "orderedNameInput";
		}
		
		@RequestMapping("/orderedNameResult")
		public String showOrderedNameResult(HttpServletRequest request){
			String firstName = request.getParameter("firstName");
			String middleInitial = request.getParameter("middleInitial");
			String lastName = request.getParameter("lastName");
			String order = request.getParameter("order");
			
			if(order.equals("FL")) {
				request.setAttribute("orderedName", firstName + " " + lastName);
			} 
			else if(order.equals("FML")) {
				request.setAttribute("orderedName", firstName+ " " + middleInitial + " " + lastName);
			}
			else if(order.equals("LF")) {
				request.setAttribute("orderedName", lastName + " " + firstName);
			}
			else {
				request.setAttribute("orderedName", lastName + ", " + firstName + " " +middleInitial);
			}
		
			return "orderedNameResult";
		}
}
