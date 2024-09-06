package com.flightbooking.entity;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="FLIGHT")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "FLIGHTID")
	private long flightId;	

	@Column(name= "ARRIVAL")
	private String arrival;
	
	@Column(name= "DEPARTURE")
	private String departure;

	@Column(name= "AIRLINEID")
	private long airlineId;
	
	
	@Column(name= "DEPARTUREDATE")
	private Date dateOfDeparture;
	
	@Column(name= "DEPARTURETIME")
	private Timestamp DepartureTime;
	



}
