package com.magictrip.flightbooking.service;

import java.util.List;

import com.magictrip.flightbooking.entity.FlightDetail;

public interface FlightService {
	
	
    List<FlightDetail> findByFlightInfoAirlineInfoNameOfAirlineAndFlightDate(String name, String origin);
	
	String saveFlights();
	
	String saveAirline();
	
	

}
