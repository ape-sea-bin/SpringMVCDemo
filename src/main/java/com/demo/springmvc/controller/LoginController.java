package com.demo.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView handleLoginRequest() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/pages/login");
//		mv.addObject(attributeName, attributeValue);
		return mv;
	}
}
