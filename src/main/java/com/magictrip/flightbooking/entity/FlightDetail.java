package com.magictrip.flightbooking.entity;

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
@Table(name="flight_Detail")
public class FlightDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "flightId")
	private long flightId;	

	@Column(name= "origin")
	private String origin;
	
	@Column(name= "destination")
	private String destination;

	
	@Column(name= "flightNumber")
	private String flightNumber;
	



	
	

	public long getId() {
		return flightId;
	}



	public void setId(long flightId) {
		this.flightId = flightId;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getFlightNumber() {
		return flightNumber;
	}



	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}



	public String getOrigin() {
		return origin;
	}



	public void setOrigin(String origin) {
		this.origin = origin;
	}


}
