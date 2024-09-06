package com.flightbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.request.CommonRequest;
import com.flightbooking.response.CommonResponse;
import com.flightbooking.service.PrimaryUserService;

@RestController
public class PrimaryUserController {
	
	@Autowired
	PrimaryUserService primaryUserService;
	
	@PutMapping("/registerUser")
	public CommonResponse registerUser(CommonRequest request) {
		return primaryUserService.registerUser(request);
	}
	
	@GetMapping("/getUserDetail")
	public CommonResponse getUserDetail(CommonRequest request) {
		return primaryUserService.getUserDetail(request);
	}
	
	@PutMapping("/updateUser")
	public CommonResponse updateAirline(CommonRequest request) {
		return primaryUserService.updateUser(request);
	}
	

}
