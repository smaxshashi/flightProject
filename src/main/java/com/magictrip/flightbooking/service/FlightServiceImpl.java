package com.magictrip.flightbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magictrip.flightbooking.entity.AirlineInfo;
import com.magictrip.flightbooking.entity.FlightDetail;
import com.magictrip.flightbooking.repository.AirlineRepoWrite;
import com.magictrip.flightbooking.repository.FlightDetailRepositoryRead;
import com.magictrip.flightbooking.repository.FlightDetailRepositoryWrite;




@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightDetailRepositoryRead flightDetailRepoRead;
	
	@Autowired
	FlightDetailRepositoryWrite flightDetailRepositoryWrite;
	
	@Autowired
	AirlineRepoWrite airlineRepoWrite;
	

	@Override
	public List<FlightDetail> findByFlightInfoAirlineInfoNameOfAirlineAndFlightDate(String name, String origin) {
		
		List<FlightDetail> getFlightDetail= flightDetailRepoRead.findByFlightInfoAirlineInfoNameOfAirlineAndFlightDate(name, origin);
		if(!getFlightDetail.isEmpty()) {
			return getFlightDetail;
		}
		return null;
		
	}


	@Override
	public String saveFlights() {
		FlightDetail flights= new FlightDetail();
		
		flights.setDestination("lucknow");
		flights.setFlightNumber("121");
		flights.setOrigin("Delhi");
		
		FlightDetail flight2= new FlightDetail();
		
		flight2.setDestination("patna");
		flight2.setFlightNumber("587");
		flight2.setOrigin("Banglore");
		
		flightDetailRepositoryWrite.save(flights);
		flightDetailRepositoryWrite.save(flight2);
		
		
		return "saved flights";
	}


	@Override
	public String saveAirline() {
		
		AirlineInfo airlineInfo= new AirlineInfo();
		
		List<FlightDetail> flightDetail= flightDetailRepoRead.getAllFlights();
		if(flightDetail!=null) {
			airlineInfo.setFlights(flightDetail);
		}
		
		airlineInfo.setName("Air India");
		airlineRepoWrite.save(airlineInfo);
		return "saved airline";
	
	}


}
