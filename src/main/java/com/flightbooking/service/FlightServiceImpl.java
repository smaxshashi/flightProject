package com.flightbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.entity.Airline;
import com.flightbooking.entity.Flight;
import com.flightbooking.repository.read.AirlineRepoRead;
import com.flightbooking.repository.read.FlightDetailRepositoryRead;
import com.flightbooking.repository.write.FlightDetailRepositoryWrite;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightDetailRepositoryRead flightDetailRepoRead;
	
	@Autowired
	FlightDetailRepositoryWrite flightDetailRepositoryWrite;
	
	@Autowired
	AirlineRepoRead airlineRepoWrite;
	

	@Override
	public List<Flight> findByFlightInfoAirlineInfoNameOfAirlineAndFlightDate(String name, String origin) {
		
		List<Flight> getFlightDetail= flightDetailRepoRead.findByFlightInfoAirlineInfoNameOfAirlineAndFlightDate(name, origin);
		if(!getFlightDetail.isEmpty()) {
			return getFlightDetail;
		}
		return null;
		
	}


	@Override
	public String saveFlights() {
//		Flight flights= new Flight();
//		
//		flights.setDateOfDeparture("lucknow");
//		flights.setFlightNumber("121");
//		flights.setOrigin("Delhi");
//		
//		Flight flight2= new Flight();
//		
//		flight2.setDestination("patna");
//		flight2.setFlightNumber("587");
//		flight2.setOrigin("Banglore");
//		
//		flightDetailRepositoryWrite.save(flights);
//		flightDetailRepositoryWrite.save(flight2);
//		
//		
		return "saved flights";
	}


	@Override
	public String saveAirline() {
		
		Airline airlineInfo= new Airline();
		
		List<Flight> flightDetail= flightDetailRepoRead.getAllFlights();
//		if(flightDetail!=null) {
//			airlineInfo.setFlights(flightDetail);
//		}
		
		airlineInfo.setName("Air India");
		airlineRepoWrite.save(airlineInfo);
		return "saved airline";
	
	}


}
