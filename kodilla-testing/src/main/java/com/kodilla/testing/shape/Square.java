package com.kodilla.testing.shape;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Square implements Shape {

    private String shapeName;
    private double high;
    private double width;

    public Square(String shapeName, double high, double width) {
        this.shapeName = shapeName;
        this.high = high;
        this.width = width;
    }


    public double getHigh() {
        return high;
    }

    public double getWidth() {
        return width;
    }

    @Override
        public String getShapeName() {
        return this.shapeName;
    }

    @Override
    public double getField() {
        double field = high * width;
        return field;
    }
}
