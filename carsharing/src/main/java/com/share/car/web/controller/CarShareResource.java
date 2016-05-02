package com.share.car.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarShareResource {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message ="Hello Car Sharers";
		//param 1 welcome ->add prefix and suffix , will map to /WEB-INF/jsp/welcome.jsp
		return new ModelAndView("welcome", "message", message);
	}
	
}
