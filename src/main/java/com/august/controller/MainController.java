package com.august.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView first_page(){
		ModelAndView modelAndView = new ModelAndView("first_page");

		System.out.println("我是sout");

		return modelAndView;
	}
}
