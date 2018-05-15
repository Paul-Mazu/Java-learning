package com.kodilla.testing;

import com.kodilla.testing.Calculator.SimpleCalculator;
import com.kodilla.testing.User.SimpleUser;

public class TestingMain {
    public static void main(String[] args){

        SimpleUser simpleUser = new SimpleUser("forumUser");

        String result = simpleUser.getUsername();

        if (result.equals("forumUser")) {
            System.out.println("test ok");
        } else {
            System.out.println("Error!");
        }

        // Calculator test

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int addResult = simpleCalculator.add(10, 15);

        if (addResult == 35){
            System.out.println("Adding works");
        } else {
            System.out.println("Adding doesn't work");
        }

        int substractResult = simpleCalculator.substract(10, 15);

        if (substractResult == -5) {
            System.out.println("Substracting works");
        } else {
            System.out.println("Substracting doesn't work");
        }



    }
}
