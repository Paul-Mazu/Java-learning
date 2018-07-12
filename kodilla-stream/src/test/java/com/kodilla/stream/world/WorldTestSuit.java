package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuit {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country china = new Country("China", new BigDecimal(654789321));
        Country israel = new Country("Israel", new BigDecimal(369852147));
        Country poland = new Country("Poland", new BigDecimal(147852369));
        Country germany = new Country("Germany", new BigDecimal(69874123));
        Country egipt = new Country("Egipt", new BigDecimal(123654789));
        Country ghana = new Country("Ghana", new BigDecimal(987456321));

        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");

        asia.addCountry(china);
        asia.addCountry(israel);
        europe.addCountry(poland);
        europe.addCountry(germany);
        africa.addCountry(egipt);
        africa.addCountry(ghana);

        World world = new World();
        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(africa);
        //When
        BigDecimal peopleQty = world.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("2353479070");
        //Then
        Assert.assertEquals(expected, peopleQty );





    }
}
