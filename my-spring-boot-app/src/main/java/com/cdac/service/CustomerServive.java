package com.cdac.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.entity.Customer;
import com.cdac.exception.CustomerServiceException;
import com.cdac.repositoty.CustomerRepo;

@Service
public class CustomerServive {
	
	@Autowired                        
	private CustomerRepo customerRepository;
	
	public int register(Customer customer ) throws CustomerServiceException {
		
		//suppose check if this customer has registered before
		 Optional<Customer> customerCheck = customerRepository.findByEmail(customer.getEmail());
		if(customerCheck.isEmpty()) {
			Customer savedCus = customerRepository.save(customer);
			return savedCus.getId();
		}else {
			throw new CustomerServiceException("customer already register");
		}
		 
		 
	}
	
	public void login() {
		
	}
	
}
