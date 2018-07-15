package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight (Flight flight) throws RouteNotFoundException {
        String arrival = flight.getArrivalAirport();
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Berlin", true);
        flights.put("Warsaw", false);

           if (flights.get(arrival) == null) {
               throw new RouteNotFoundException("That direction doesn't exist");

           } else if (flights.get(arrival)) {
                System.out.println("The flight to " + flight.toString() + " is possible.");
                return;
            }
                System.out.println("The flight to " + flight.toString() + " is not possible.");
            }
    }
