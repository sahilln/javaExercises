package com.techelevator;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BabyLottoController {

	@RequestMapping("/babyLottoInput")
	public String showBabyLottoInput(){
		return "babyLottoInput";
	}
	
	@RequestMapping("/babyLottoResult")
	public String showBabyLottoResult(HttpServletRequest request){
		String ticket1Color = lottoWin(request.getParameter("ticket1"));
		request.setAttribute("ticket1color", ticket1Color);
		
		String ticket2Color = lottoWin(request.getParameter("ticket2"));
		request.setAttribute("ticket2color", ticket2Color);
		
		String ticket3Color = lottoWin(request.getParameter("ticket3"));
		request.setAttribute("ticket3color", ticket3Color);
		
		String ticket4Color = lottoWin(request.getParameter("ticket4"));
		request.setAttribute("ticket4color", ticket4Color);
		
		String ticket5Color = lottoWin(request.getParameter("ticket5"));
		request.setAttribute("ticket5color", ticket5Color);
		
		return "babyLottoResult";
	}

	public String lottoWin(String ticket){
		List<String> ticketList = Arrays.asList(ticket.split(", "));
		if(ticketList.get(0).equals(ticketList.get(1)) && ticketList.get(1).equals(ticketList.get(2))){
			return "green";
		}
		else if(ticketList.get(0).equals(ticketList.get(1)) || ticketList.get(0).equals(ticketList.get(2)) || ticketList.get(1).equals(ticketList.get(2))){
			return "silver";
		}
		else{
			return "black";
		}
	}
}




