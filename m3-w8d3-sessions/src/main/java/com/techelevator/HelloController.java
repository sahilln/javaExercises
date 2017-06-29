package com.techelevator;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller 
@RequestMapping("/FavoriteThings")
@SessionAttributes("favThings")
public class HelloController {

	@RequestMapping("/greeting")
	public String displayGreeting() {
		
		return "greeting";
	}
	
	@RequestMapping(path="/page1", method=RequestMethod.GET)
	public String displayPage1(){
		return "/page1";
	}
	
	@RequestMapping(path="/page1", method=RequestMethod.POST)
	public String processPage1(@RequestParam String color, ModelMap model){
		
		FavoriteThings things = new FavoriteThings();
		things.setColor(color);
		
		model.addAttribute("favThings", things);
		
		return "redirect:/FavoriteThings/page2";
	}
	
	@RequestMapping(path="/page2", method=RequestMethod.GET)
	public String displayPage2(){
		return "/page2";
	}
	
	@RequestMapping(path="/page2", method=RequestMethod.POST)
	public String processPage2(@RequestParam String food, ModelMap model){
		
		FavoriteThings things = (FavoriteThings)model.get("favThings");
		things.setFood(food);
		
		model.addAttribute("things", things);
		
		return "redirect:/FavoriteThings/page3";
	}
	
	@RequestMapping(path="/page3", method=RequestMethod.GET)
	public String displayPage3(){
		return "/page3";
	}
	
	@RequestMapping(path="/page3", method=RequestMethod.POST)
	public String processPage3(@RequestParam String season, ModelMap model){
		
		FavoriteThings things = (FavoriteThings)model.get("favThings");
		things.setSeason(season);
		
		return "redirect:/FavoriteThings/summary";
	}
	
	@RequestMapping(path="/summary", method=RequestMethod.GET)
	public String showSummary(){
		return "/summary";
	}
}
