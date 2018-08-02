package com.kodilla.patterns.strategy;

public class Customers {
    final private String name;
    protected BuyPredictor buyPredictor;

    public Customers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String predict() {
        return buyPredictor.predictWhatToBuy();
    }

    public void setBuyingStrategy(BuyPredictor buyPredictor) {
        this.buyPredictor = buyPredictor;
    }
}
