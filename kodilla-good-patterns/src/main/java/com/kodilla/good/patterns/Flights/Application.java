package com.kodilla.good.patterns.Flights;

public class Application {
    public static void main(String[] args) {

        FlightsFinder flightsFinder = new FlightsFinder();
        flightsFinder.findDepartures("Wroclaw");
        flightsFinder.findDepartures("Warszawa");
        flightsFinder.findNotDirect("Wroclaw", "Warszawa");

    }
}
