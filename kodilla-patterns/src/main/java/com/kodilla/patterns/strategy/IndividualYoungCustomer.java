package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AgressivePredictor;

public class IndividualYoungCustomer extends Customers {

    public IndividualYoungCustomer (String name) {
        super(name);
        this.buyPredictor = new AgressivePredictor();
    }
}
