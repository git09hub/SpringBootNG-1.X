package com.boot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*Web services controller*/

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello(@RequestParam String name) {
		return "Hello "+name;
	}	
}
