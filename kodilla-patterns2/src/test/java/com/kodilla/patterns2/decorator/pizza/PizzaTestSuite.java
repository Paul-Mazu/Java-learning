package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaTestSuite {
    @Test
    public void testPizzaWithAdditionalCheeseAndChampignons() {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new Champignons(new AdditionalCheese(thePizza));
        //When
        BigDecimal thePrice = thePizza.getCost();
        String theDesc = thePizza.getDescription();
        //Then
        Assert.assertEquals(new BigDecimal(27), thePrice);
        Assert.assertEquals("Ciasto, Sos, Ser + dodatkowy ser + pieczarki", theDesc);
    }
}
