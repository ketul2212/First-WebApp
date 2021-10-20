package com.ketul.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContectController {

	@RequestMapping("contect")
	public String cont() {
		
		return "contect";
	}
}
