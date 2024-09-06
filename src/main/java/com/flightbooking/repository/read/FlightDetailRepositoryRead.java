package com.flightbooking.repository.read;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flightbooking.entity.Flight;


@Repository
public interface FlightDetailRepositoryRead extends CrudRepository<Flight, Long> {


	@Query(value= "select b from Flight b where b.flightId=?1 and b.arrival= ?2")
	List<Flight> findByFlightInfoAirlineInfoNameOfAirlineAndFlightDate(String name, String origin);

	
	@Query(value= "select b from Flight b")
	List<Flight> getAllFlights();

}
