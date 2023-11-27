package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Farm;

public interface FarmRepository extends JpaRepository<Farm, Long> {
	@Query(value = "SELECT farmid, farm_name, premiseid, total_animal FROM farm_database.farm;", nativeQuery = true)
	List<Object> getFarmRecords();
}

