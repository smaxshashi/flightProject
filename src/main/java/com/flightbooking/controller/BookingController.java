package com.flightbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.request.AirlineRequest;
import com.flightbooking.response.CommonResponse;
import com.flightbooking.service.AirlineService;

@RestController
public class BookingController {
	
	@Autowired
	AirlineService airlineService;
	

	

}
