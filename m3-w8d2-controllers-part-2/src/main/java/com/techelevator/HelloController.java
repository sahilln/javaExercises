package com.techelevator;

import java.time.LocalDateTime;
import java.util.List;  
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller 
public class HelloController {
	@Autowired
	private ReviewDao reviewDao; 
	
	@RequestMapping(path="/homePage", method=RequestMethod.GET)
	public String showHomePage(HttpServletRequest request) {
		List<Review> reviewList = reviewDao.getAllReviews();
		request.setAttribute("reviewList", reviewList);
		
		return "homePage";
	}

	@RequestMapping(path="/reviewPost", method=RequestMethod.GET)
	public String showReviewPost() {
		return "reviewPost";
	}
	
	@RequestMapping(path="/reviewPost", method=RequestMethod.POST)
	public String reviewPost(Review review) {
		review.setDateSubmitted(LocalDateTime.now());
		reviewDao.save(review);
		return"redirect:/homePage";
	}
}
