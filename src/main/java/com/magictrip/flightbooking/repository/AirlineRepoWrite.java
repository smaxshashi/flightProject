package com.magictrip.flightbooking.repository;

import org.springframework.data.repository.CrudRepository;

import com.magictrip.flightbooking.entity.AirlineInfo;

public interface AirlineRepoWrite extends CrudRepository<AirlineInfo, Long> {

}
