package com.kodilla.good.patterns.Flights;

import java.util.HashSet;
import java.util.Objects;

public class Flights {

    private String departure;
    private String destination;

    public Flights(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return Objects.equals(departure, flights.departure) &&
                Objects.equals(destination, flights.destination);
    }

    @Override
    public int hashCode() {

        return Objects.hash(departure, destination);
    }
}
