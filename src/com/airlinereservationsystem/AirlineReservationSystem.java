package com.airlinereservationsystem;
import java.util.ArrayList;
import java.util.List;

public class AirlineReservationSystem {
	private List<Flight> flights;
	private List<Reservation> reservations;

	public AirlineReservationSystem() {
		flights = new ArrayList<>();
		reservations = new ArrayList<>();
	}

	public void addFlight(Flight flight) {
		flights.add(flight);
	}

	public void makeReservation(String passengerName, String flightNumber) {
		Flight selectedFlight = null;

		for (Flight flight : flights) {
			if (flight.getFlightNumber().equals(flightNumber)) {
				selectedFlight = flight;
				break;
			}
		}

		if (selectedFlight == null) {
			System.out.println("Invalid flight number.");
			return;
		}

		if (selectedFlight.getAvailableSeats() > 0) {
			Reservation reservation = new Reservation(passengerName, flightNumber);
			reservations.add(reservation);
			selectedFlight.setAvailableSeats(selectedFlight.getAvailableSeats() - 1);
			System.out.println("Reservation successfully made.");
		} else {
			System.out.println("No available seats on the selected flight.");
		}
	}

	public void printReservations() {
		for (Reservation reservation : reservations) {
			System.out.println(
					"Passenger: " + reservation.getPassengerName() + ", Flight: " + reservation.getFlightNumber());
		}
	}
}
