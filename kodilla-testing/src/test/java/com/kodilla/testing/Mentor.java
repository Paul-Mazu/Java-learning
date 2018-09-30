package com.kodilla.testing;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Mentor {

    @Test
    public void testCountEmptyStringUsingJava7() {
        //given
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        //when
        long count = Main.getCountEmptyStringUsingJava7(strings);
        //then
        Assert.assertEquals(2, count);
    }

    @Test
    public void testMax() {
        //given
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        Integer expected = 7;
        //when
        Integer result = Main.getMax(numbers);
        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testAverage() {
        //given
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        Integer expected = 3;
        //when
        Integer result = Main.getAverage(numbers);
        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSquares() {
        //given
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> expected = Arrays.asList(9, 4, 49, 25);
        //when
        List<Integer> result = Main.getSquares(numbers);
        //then
        Assert.assertEquals(4, result.size());
        Assert.assertEquals(expected, result);
    }

}
