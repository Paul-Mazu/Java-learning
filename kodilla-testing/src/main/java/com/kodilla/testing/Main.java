package com.kodilla.testing;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static long getCountEmptyStringUsingJava7(List<String> theList) {

        long x = 0;
        for(String temp: theList) {
            if (temp.length() == 0) {
                x++;
            }
        }

        return x;

    }

    public static Integer getMax(List<Integer> theList1) {
        Integer x = theList1.get(0);
        for (Integer temp: theList1) {
            if (temp > x) {
                x=temp;
            }
        }

        return x;
    }

    public static Integer getAverage(List<Integer> theList1) {
        Integer sum = 0;
        for(Integer temp: theList1) {
            sum = sum + temp;
        }
        Integer avg = sum / theList1.size();
        return avg;
    }

    public static List<Integer> getSquares(List<Integer> theList) {
        Integer x;
        List<Integer> newList = new ArrayList<>();
        for (Integer temp: theList) {
            x = temp * temp;
            if (!newList.contains(x)) {
                newList.add(x);
            }
        }
        return newList;
    }



}
