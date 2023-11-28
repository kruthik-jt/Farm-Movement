package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Movement;

public interface MovementRepository extends JpaRepository<Movement, Long> {
	@Query(value = "SELECT movement_reason.reason_description FROM movement JOIN movement_reason on movement.movement_reasonid = movement_reason.movement_reasonid;", nativeQuery = true)
	List<Object> getMovementReason();
	
	@Query(value = "select address.state from movement join address on movement.originid=address.addressid", nativeQuery = true)
	List<String> getMoveOutState();
	
	@Query(value = "select address.state from movement join address on movement.destinationid=address.addressid", nativeQuery = true)
	List<String> getMoveInState();
	
	@Query(value = "SELECT o.latitude AS OriginLatitude, o.longitude AS OriginLongitude, d.latitude AS DestinationLatitude, d.longitude AS DestinationLongitude FROM movement m JOIN coordinates d ON m.DestinationID = d.coordinateid JOIN coordinates o ON m.OriginID = o.coordinateid;\r\n"
			+ "", nativeQuery = true)
	List<String> getMovementCoordinates();
}
