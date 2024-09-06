package com.flightbooking.service;

import com.flightbooking.request.CommonRequest;
import com.flightbooking.response.CommonResponse;

public interface PrimaryUserService {
	
	CommonResponse registerUser(CommonRequest request);
	CommonResponse getUserDetail(CommonRequest request);
	CommonResponse updateUser(CommonRequest request);

}
