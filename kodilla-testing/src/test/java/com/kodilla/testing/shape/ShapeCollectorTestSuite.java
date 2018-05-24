package com.kodilla.testing.shape;


import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Tests began");
    }

    @Before
    public void beforeEach(){
        testCounter ++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }

    @Test //1
    public void testAddFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square theSquare = new Square("Square", 20, 20);
        Circle theCircle = new Circle("theCircle", 50);
        Triangle theTriangle = new Triangle("theTriangle", 30, 30);
        //When
        shapeCollector.addFigure(theSquare);
        shapeCollector.addFigure(theCircle);
        shapeCollector.addFigure(theTriangle);
        //Than
        Assert.assertEquals(3, shapeCollector.getShapesList().size());
    }

    @Test //2
    public void testRemoveFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square theSquare = new Square("Square", 20, 20);
        Circle theCircle = new Circle("theCircle", 50);
        Triangle theTriangle = new Triangle("theTriangle", 30, 30);
        //When
        shapeCollector.addFigure(theSquare);
        shapeCollector.addFigure(theCircle);
        shapeCollector.addFigure(theTriangle);
        boolean result = shapeCollector.removeFigure(theCircle);
        //Then
        Assert.assertEquals(2, shapeCollector.getShapesList().size());
        Assert.assertTrue(result);
    }

    @Test //3
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square theSquare = new Square("Square", 20, 20);
        //When
        shapeCollector.addFigure(theSquare);
        Shape anyShape;
        anyShape = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(theSquare, anyShape);
    }

    @Test //4
    public void testGetShapeName(){
        //Given
        Square theSquare = new Square("Square", 10,10);
        //When
        String current = theSquare.getShapeName();
        //Then
        Assert.assertEquals("Square", current);
    }

}
