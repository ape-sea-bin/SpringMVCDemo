package com.demo.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
	@RequestMapping("/default")
	public String handleDefaultRequest() {
		return "landing/pages/default";
	}
}
