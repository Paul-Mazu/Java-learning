package com.kodilla.testing.shape;

import static java.lang.Math.pow;

public class Circle implements Shape {

    private String circleName;
    private double radius;

    public Circle(String circleName, double radius) {
        this.circleName = circleName;
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return pi * pow(pi, 2) ;
    }

    final double pi =  3.14;


}
