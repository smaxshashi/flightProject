package com.flightbooking.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.entity.PrimaryUser;
import com.flightbooking.repository.read.PrimaryUserRepoRead;
import com.flightbooking.repository.write.PrimaryUserRepoWrite;
import com.flightbooking.request.CommonRequest;
import com.flightbooking.response.CommonResponse;
import com.project.flightreservation.utility.LMDSUtility;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class PrimaryUserServiceImpl implements PrimaryUserService {
	
	@Autowired
	private PrimaryUserRepoRead userRepositoryRead;

	@Autowired
	private PrimaryUserRepoWrite userRepositoryWrite;

	@Override
	public CommonResponse registerUser(CommonRequest request) {
		CommonResponse response = new CommonResponse();
		if (!Objects.isNull(request)) {
			PrimaryUser getuser = userRepositoryRead.getUserByMobileAndEmail(request.getMobile(),
					request.getEmail());
			PrimaryUser user = new PrimaryUser();
			log.info("GET user {}", getuser);
			if (getuser == null) {
				user.setCreateDate(LMDSUtility.getDate());
				user.setEmail(request.getEmail());
				user.setIsActive('Y');
				user.setIsDeleted('N');
			
				user.setName(request.getName());
				user.setMobile(request.getMobile());

				userRepositoryWrite.save(user);
				response.setMessage("Thanks For Registring");
				response.setStatus(0);
				return response;
			}
			response.setMessage("You are already Registered");
			response.setStatus(-1);
			return response;
		}
		response.setMessage("Please entered your detail");
		response.setStatus(-1);
		return response;
	}

	@Override
	public CommonResponse getUserDetail(CommonRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommonResponse updateUser(CommonRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
