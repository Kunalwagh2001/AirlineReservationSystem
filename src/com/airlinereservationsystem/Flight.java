package com.airlinereservationsystem;
import java.util.*;

public class Flight {
    private String flightNumber;
    private String source;
    private String destination;
    private int availableSeats;
    
    public Flight(String flightNumber, String source, String destination, int availableSeats) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }
    
    // Getters and setters
    
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}