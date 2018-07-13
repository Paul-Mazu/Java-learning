package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException() {
        System.out.println("Sorry, we didn't find that route");
    }
}
