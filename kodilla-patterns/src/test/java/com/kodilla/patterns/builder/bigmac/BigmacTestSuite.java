package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.bigMac.Bigmac;
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

    }
}
