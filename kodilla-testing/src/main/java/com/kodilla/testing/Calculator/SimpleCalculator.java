package com.kodilla.testing.Calculator;

public class SimpleCalculator {

    int a;
    int b;
    public SimpleCalculator(int a , int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int substract() {
        return a - b;
    }

}
