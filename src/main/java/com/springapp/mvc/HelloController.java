package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(value="/welcome")
	public ModelAndView printWelcome(ModelMap model) {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("welcome");
		modelAndView.addObject("message", "Hello,Velocity");
		return modelAndView;
	}
}