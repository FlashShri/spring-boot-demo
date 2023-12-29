package com.cdac;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	// rest controller we only deal with JSON data 
	// as we are getting data in form of json 
	
	@GetMapping("/hello-rest.cdac")
	public String sayHello() {	
		return "Hello from Spring rest controller" ;
	}
	

}
