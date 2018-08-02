package com.kodilla.patterns.strategy.predictors;

import com.kodilla.patterns.strategy.BuyPredictor;

public class AgressivePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "Agressive predictor";
    }
}
