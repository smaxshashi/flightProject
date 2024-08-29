package com.magictrip.flightbooking.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class AirlineInfo {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;

	@OneToMany
	@JoinColumn(name="fk_flight", referencedColumnName = "id")
	private List<FlightDetail> flights;

	
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<FlightDetail> getFlights() {
		return flights;
	}
	public void setFlights(List<FlightDetail> flights) {
		this.flights = flights;
	}
	public long getId() {
		return id;
	}
}
