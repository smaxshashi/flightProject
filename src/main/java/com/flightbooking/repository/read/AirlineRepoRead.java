package com.flightbooking.repository.read;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flightbooking.entity.Airline;

@Repository
public interface AirlineRepoRead extends CrudRepository<Airline, Long> {

}
