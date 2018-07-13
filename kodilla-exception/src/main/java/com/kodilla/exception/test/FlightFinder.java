package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight (Flight flight) throws RouteNotFoundException {
        String arrival = flight.getArrivalAirport();
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Berlin", true);
        flights.put("Warsaw", false);

        try {
            if (flights.get(arrival) == true) {
                System.out.println("The flight to " + flight.toString() + " is possible.");
                return;
            }
            System.out.println("The flight to " + flight.toString() + " is not possible.");

        } catch (NullPointerException e) {
            new RouteNotFoundException();
        }
    }
}
