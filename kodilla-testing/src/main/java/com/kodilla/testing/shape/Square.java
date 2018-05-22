package com.kodilla.testing.shape;

public class Square implements Shape {

    String shapeName;
    double high;
    double width;

    public Square(String shapeName, double high, double width) {
        this.shapeName = shapeName;
        this.high = high;
        this.width = width;
    }


    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        double field = high * width;
        return field;
    }
}
