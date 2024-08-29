package com.magictrip.flightbooking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.magictrip.flightbooking.entity.FlightDetail;

@Repository
public interface FlightDetailRepositoryWrite extends CrudRepository<FlightDetail, Long> {

}
