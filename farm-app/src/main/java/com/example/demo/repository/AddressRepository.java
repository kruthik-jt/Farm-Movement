package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
	@Query(value = "SELECT State from address", nativeQuery = true)
	List<String> getAllFarmStates();
}

