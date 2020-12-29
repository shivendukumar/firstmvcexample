package com.coursecube.springboot;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PageController {

//	@GetMapping("hello/{id}")
	/*
	 * @GetMapping("first") public String showBidPages() {
	 * System.out.println("We are inside showBidPages() method"); return "first"; }
	 */
	
	@GetMapping("first/{id}")
	public String showBidPages(@PathVariable String id) {
		System.out.println(id);
		System.out.println("We are inside showBidPages() method");
		return "first";
	}
}
