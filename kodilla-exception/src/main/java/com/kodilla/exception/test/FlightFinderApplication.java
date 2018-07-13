package com.kodilla.exception.test;

public class FlightFinderApplication {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(new Flight("Wroclaw", "Berlin"));
        } catch (RouteNotFoundException e) {
        }
    }
}
