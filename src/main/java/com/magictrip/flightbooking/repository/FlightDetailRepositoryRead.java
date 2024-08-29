package com.magictrip.flightbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.magictrip.flightbooking.entity.FlightDetail;


@Repository
public interface FlightDetailRepositoryRead extends CrudRepository<FlightDetail, Long> {


	@Query(value= "select b from FlightDetail b where b.flightNumber=?1 and b.origin= ?2")
	List<FlightDetail> findByFlightInfoAirlineInfoNameOfAirlineAndFlightDate(String name, String origin);

	
	@Query(value= "select b from FlightDetail b")
	List<FlightDetail> getAllFlights();

}
