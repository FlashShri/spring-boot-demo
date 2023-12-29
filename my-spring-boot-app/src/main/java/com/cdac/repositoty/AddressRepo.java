package com.cdac.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
