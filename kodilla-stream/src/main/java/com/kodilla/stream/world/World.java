package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class World {



    public List<String> continentsList() {
        List<String> theListOfContinents = new ArrayList<>();
        theListOfContinents.add("Asia");
        theListOfContinents.add("Africa");
        theListOfContinents.add("North America");
        theListOfContinents.add("South America");
        theListOfContinents.add("Europe");
        theListOfContinents.add("Australia");
        return theListOfContinents;
    }
}

