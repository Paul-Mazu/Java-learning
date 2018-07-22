package com.kodilla.good.patterns.Flights;

import java.util.HashSet;
import java.util.Set;

public class ListOfFlights {

    public static Set<Flights> flightsList() {
        //Brak bezposredniego Wroclaw -> Warszawa
        Set<Flights> flights = new HashSet<>();
        flights.add(new Flights("Wroclaw", "Poznan"));
        flights.add(new Flights("Wroclaw", "Krakow"));
        flights.add(new Flights("Warszawa", "Poznan"));
        flights.add(new Flights("Warszawa", "Wroclaw"));
        flights.add(new Flights("Warszawa", "Krakow"));
        flights.add(new Flights("Poznan", "Krakow"));
        flights.add(new Flights("Poznan", "Warszawa"));
        flights.add(new Flights("Poznan", "Wroclaw"));
        flights.add(new Flights("Krakow", "Wroclaw"));
        flights.add(new Flights("Krakow", "Warszawa"));
        flights.add(new Flights("Krakow", "Poznan"));
        flights.add(new Flights("Gdynia", "Warszawa"));
        return flights;
    }
}
