package com.techelevator;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller 
public class HelloController {
	@Autowired
	private ReviewDao reviewDao; 
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String showHomePage(HttpServletRequest request) {
		// Get Reviews from database
		List<Review> reviewList = reviewDao.getAllReviews();
		request.setAttribute("reviewList", reviewList);
		
		return "homePage";
	}
}
