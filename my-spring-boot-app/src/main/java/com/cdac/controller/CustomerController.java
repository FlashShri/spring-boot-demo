package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.dto.registrationStatus;
import com.cdac.entity.Customer;
import com.cdac.exception.CustomerServiceException;
import com.cdac.service.CustomerServive;

@RestController
@CrossOrigin
public class CustomerController {
	
	
	@Autowired
	private CustomerServive customerService;
	
	
	//json to obj
	//from postman used post method
	// payload --> json -->
//		{
//		  "name" : "mark",
//		  "email" : "mark@gmail.com",
//		  "password" : "elon@123"
//		}
	@PostMapping("/register")
	public registrationStatus register(@RequestBody Customer customer) {
		
		try {
			 int id = customerService.register(customer);
			
			registrationStatus status = new registrationStatus();
			status.setStatus(true);
			status.setStatusMasg("Customer register successfully");
			status.setCid(id);
			return status;
		} catch (CustomerServiceException e) {
			registrationStatus status = new registrationStatus();
			status.setStatus(false);
			status.setStatusMasg(e.getMsg());
			return status;
		}
		
	}
}
