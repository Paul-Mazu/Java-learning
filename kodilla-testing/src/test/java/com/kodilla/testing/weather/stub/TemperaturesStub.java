package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures{


    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResults = new HashMap<>();
        //dummy data
        stubResults.put(0, 25.5);
        stubResults.put(1, 26.2);
        stubResults.put(2, 24.1);
        stubResults.put(3, 25.2);
        stubResults.put(4, 23.2);
        return stubResults;
    }
}
