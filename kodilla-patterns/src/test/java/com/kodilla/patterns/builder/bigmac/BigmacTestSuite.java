package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.bigMac.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void bigmacBuilderTest() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sezam")
                .burgers(2)
                .sauce("standard")
                .ingredients("Onion")
                .ingredients("Beckon")
                .build();
        System.out.println(bigmac);
        //When
        int howManyBurgers = bigmac.getBurgers();
        boolean ingredient = bigmac.getIngredients().contains("Onion");
        //Then
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertTrue(ingredient);
    }
}
