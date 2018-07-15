package com.kodilla.exception.test;

public class FlightFinderApplication {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(new Flight("Wroclaw", "Warsaw"));
        } catch (RouteNotFoundException e) {
            System.out.println("We haven't found typed direction");
        }
    }
}
