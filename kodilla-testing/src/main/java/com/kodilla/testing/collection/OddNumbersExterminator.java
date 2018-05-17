package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {


    ArrayList<Integer>evenList = new ArrayList<>();
    public void exterminate(ArrayList<Integer> numbers) {

        for (Integer theNumber: numbers) {
            int temporary = theNumber % 2;
            if (temporary == 0){
                evenList.add(theNumber);
                System.out.println(theNumber);
            }
        }
    }
}
