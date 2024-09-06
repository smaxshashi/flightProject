package com.flightbooking.service;

import java.util.List;

import com.flightbooking.entity.Flight;

public interface FlightService {
	
	
    List<Flight> findByFlightInfoAirlineInfoNameOfAirlineAndFlightDate(String name, String origin);
	
	String saveFlights();
	
	String saveAirline();
	
	

}
