package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert. *;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //When
        String theDesc = taxiOrder.getDescription();
        //Then
        assertEquals("Drive a course", theDesc);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //When
        BigDecimal theCost = taxiOrder.getCost();
        //Then
        assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //When
        String theDesc = theOrder.getDescription();
        //Then
        assertEquals("Drive a course by Taxi Network", theDesc);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new ChildSeatDecorator(new ChildSeatDecorator(new MyTaxiNetworkOrderDecorator(theOrder)));
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(39), theCost);
    }
}
