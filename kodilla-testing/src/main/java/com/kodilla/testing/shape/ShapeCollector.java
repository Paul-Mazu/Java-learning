package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List <Shape> shapesList = new ArrayList<Shape>();

    public List<Shape> getShapesList() {
        return shapesList;
    }

    public void addFigure(Shape shape){
        shapesList.add(shape);
    }

    public boolean removeFigure(Shape shape){

        return shapesList.remove(shape);
    }

    public Shape getFigure(int n){
        Shape shape = null;
        if (n >= 0 && n < shapesList.size()) {
            shape = shapesList.get(n);
        }
        return shape;
    }

    public void showFigures(){

    }

}
