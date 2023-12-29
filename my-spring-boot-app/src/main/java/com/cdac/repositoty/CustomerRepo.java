package com.cdac.repositoty;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
		
	public Optional<Customer> findByEmail(String email);
}
