package com.flightbooking.entity;

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
@Table(name="FLIGHTNUMER")
public class FlightNumber {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "FLIGHTNUMID")
	private long FLIGHTNUMID;
	
	@Column(name= "FLIGHTNUMBER")
	private String FLIGHTNUMBER;
	
	@Column(name= "AIRLINENAME")
	private long flightId;
	
	@Column(name= "FLIGHTID")
	private long airlineId;

}
	
