package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AgressivePredictor;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTestSuite {
    @Test
    public void testDefaultInvestingStrategies() {
        //Given
        Customers steven = new IndividualCustomer("Steven Links");
        Customers john = new IndividualYoungCustomer("John Hemerald");
        Customers kodilla = new CorporateCustomer("Kodilla");
        //When
        String stevenBuys = steven.predict();
        System.out.println(stevenBuys);
        String johnBuys = john.predict();
        System.out.println(johnBuys);
        String kodillaBuys = kodilla.predict();
        System.out.println(kodillaBuys);
        //Then
        Assert.assertEquals("Conservative predictor", stevenBuys);
        Assert.assertEquals("Agressive predictor", johnBuys);
        Assert.assertEquals("Balanced predictor", kodillaBuys);

    }

    @Test
    public void testIndividualInvestingStrategy() {
        //Given
        Customers steven = new IndividualCustomer("Steven");
        //When
        String stevenShouldBuy = steven.predict();
        System.out.println(stevenShouldBuy);
        steven.setBuyingStrategy(new AgressivePredictor());
        stevenShouldBuy = steven.predict();
        System.out.println(stevenShouldBuy);
        //Then
        Assert.assertEquals("Agressive predictor", stevenShouldBuy);
    }
}
