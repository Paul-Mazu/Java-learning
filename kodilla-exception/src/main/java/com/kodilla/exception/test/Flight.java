package com.kodilla.exception.test;

public class Flight {

    private final String departureAirport;
    private final String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return arrivalAirport;
    }
}
