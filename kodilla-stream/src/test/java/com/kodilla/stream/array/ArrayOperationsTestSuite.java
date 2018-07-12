package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ArrayOperationsTestSuite implements ArrayOperations {

    @Test
    public void testGetAverage() {
        //Given
        int[] theNumbers = {10, 20, 30, 50, 80, 100, 60};
        //When
        double avg = ArrayOperations.getAverage(theNumbers);
        //Then
        Assert.assertEquals(50, avg, 0.001);
    }

}
