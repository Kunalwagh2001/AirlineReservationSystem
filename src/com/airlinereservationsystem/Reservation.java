package com.airlinereservationsystem;

public class Reservation {
	private String passengerName;
	private String flightNumber;

	public Reservation(String passengerName, String flightNumber) {
		this.passengerName = passengerName;
		this.flightNumber = flightNumber;
	}

	// Getters and setters

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
}
