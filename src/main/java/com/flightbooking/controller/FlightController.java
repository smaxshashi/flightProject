package com.flightbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.service.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	FlightService flightService;
	
	@GetMapping("/")
	public String homepage() {
		return "searchFlights";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/bookFlight")
	public String bookFlight() {
		return "bookFlight";
	}
	

	@GetMapping("/myWebsite")
	public String checkinPage() {
		return "mariana trench";
	}
	
	@GetMapping("/saveFlight")
	public String saveFlight() {
		return flightService.saveFlights();
	}
	
	@GetMapping("/saveAirline")
	public String saveAirline() {
		return flightService.saveAirline();
	}


}
