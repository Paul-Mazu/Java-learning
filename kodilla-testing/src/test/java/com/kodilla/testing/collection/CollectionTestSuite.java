package com.kodilla.testing.collection;
import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;


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
        ArrayList<Integer> theEmptyList = new ArrayList<>();
        OddNumbersExterminator exterminator1 = new OddNumbersExterminator();
        ArrayList<Integer>myTestList1 = exterminator1.exterminate(theEmptyList);
        Assert.assertEquals(0, myTestList1.size());
    }


    @Test

    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> theNormalList = new ArrayList<>();
        for (int i =0; i < 10; i++){
            theNormalList.add(i + 1);
        }
        OddNumbersExterminator exterminator2 = new OddNumbersExterminator();
        ArrayList<Integer>myTestList = exterminator2.exterminate(theNormalList);
        Assert.assertEquals(new Integer(2), myTestList.get(0));

    }
}