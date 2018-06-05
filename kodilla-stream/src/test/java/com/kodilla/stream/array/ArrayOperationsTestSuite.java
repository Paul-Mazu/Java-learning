package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ArrayOperationsTestSuite implements ArrayOperations {

    @Test
    public void testGetAverage() {
        //Given
        int[] theNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //When
        double expected = ArrayOperations.getAverage(theNumbers);
        //Then
        Assert.assertEquals(10.5, expected, 0);
    }

}
