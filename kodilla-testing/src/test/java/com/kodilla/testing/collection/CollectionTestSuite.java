package com.kodilla.testing.collection;
import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Case is in test");
    }
    @After
    public void after(){
        System.out.println("Case has been tested");
    }

    @Test

    public void testOddNumbersExterminatorEmptyList() {
        List<Integer> theEmptyList = new ArrayList<>();
        OddNumbersExterminator exterminator1 = new OddNumbersExterminator();
        List<Integer>myTestList1 = exterminator1.exterminate(theEmptyList);
        Assert.assertEquals(0, myTestList1.size());
    }


    @Test

    public void testOddNumbersExterminatorNormalList() {
        List<Integer> theNormalList = new ArrayList<>();
        for (int i =0; i < 7; i++){
            theNormalList.add(i + 1);
        }
        OddNumbersExterminator exterminator2 = new OddNumbersExterminator();
        List<Integer>myTestList = exterminator2.exterminate(theNormalList);

        Assert.assertEquals(new Integer(2), myTestList.get(0));

        List<Integer>listFotComparison = Arrays.asList(2, 4, 6);

        Assert.assertEquals(listFotComparison, myTestList);

    }
}