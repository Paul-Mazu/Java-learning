package com.kodilla.testing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Practice {
    public static void main(String[] args) {

        List<Integer> myArrayList = new ArrayList<>();
        listGenerator(myArrayList, 100, 1000);

        List<Integer> myLinkedList = new LinkedList<>();
        listGenerator(myLinkedList, 50, 100);



        System.out.println(averageCount(myArrayList));
        System.out.println(averageCount(myLinkedList));



    }

    public static double averageCount(List<Integer> anyList) {
        int summary = 0;
        for (Integer temp : anyList) {
            summary += temp;
        }
        return summary/(double)anyList.size();
    }

     public static void listGenerator(List<Integer>anyList, int howMany, int maxNumber) {
        Random random = new Random();
         for (int i = 0; i < howMany; i++) {
             anyList.add(random.nextInt(maxNumber));
         }
    }

}

