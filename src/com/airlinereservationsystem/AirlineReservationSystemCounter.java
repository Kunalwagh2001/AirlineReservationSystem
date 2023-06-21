package com.airlinereservationsystem;

import java.util.Scanner;

public class AirlineReservationSystemCounter {

	public static void main(String[] args) {
		AirlineReservationSystem system = new AirlineReservationSystem();

		Scanner scanner = new Scanner(System.in);

		try {

			while (true) {
				System.out.println("Airline Reservation System Menu");
				System.out.println("1. Add Flight");
				System.out.println("2. Make Reservation");
				System.out.println("3. Print Reservations");
				System.out.println("4. Exit");
				System.out.print("Enter your choice: ");
				int choice = scanner.nextInt();
				
				// Consume the newline character
				scanner.nextLine(); 

				switch (choice) {
				case 1:
					System.out.print("Enter flight number: ");
					String flightNumber = scanner.nextLine();
					System.out.print("Enter source: ");
					String source = scanner.nextLine();
					System.out.print("Enter destination: ");
					String destination = scanner.nextLine();
					System.out.print("Enter available seats: ");
					int availableSeats = scanner.nextInt();
					
					// Consume the newline character
					scanner.nextLine();

					Flight flight = new Flight(flightNumber, source, destination, availableSeats);
					system.addFlight(flight);

					System.out.println("Flight added successfully.");
					break;

				case 2:
					System.out.print("Enter passenger name: ");
					String passengerName = scanner.nextLine();
					System.out.print("Enter flight number: ");
					flightNumber = scanner.nextLine();

					system.makeReservation(passengerName, flightNumber);
					break;

				case 3:
					system.printReservations();
					break;

				case 4:
					System.out.println("Exiting...");
					System.exit(0);

				default:
					System.out.println("Invalid choice. Please try again.");
				}
				
				// Empty line for readability
				System.out.println();

			}
		} finally {
			scanner.close();
		}
	}
}
