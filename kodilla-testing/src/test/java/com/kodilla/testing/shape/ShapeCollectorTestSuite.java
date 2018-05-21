package com.kodilla.testing.shape;


import org.junit.*;

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
        Square theSquare = new Square();
        Circle theCircle = new Circle();
        Triangle theTriangle = new Triangle();
        //When
        shapeCollector.addFigure(theSquare);
        shapeCollector.addFigure(theCircle);
        shapeCollector.addFigure(theTriangle);
        //Than
        Assert.assertEquals(3, shapeCollector.shapesList.size());
    }

    @Test //2
    public void testRemoveFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square theSquare = new Square();
        Circle theCircle = new Circle();
        Triangle theTriangle = new Triangle();
        //When
        shapeCollector.addFigure(theSquare);
        shapeCollector.addFigure(theCircle);
        shapeCollector.addFigure(theTriangle);
        shapeCollector.removeFigure(theCircle);
        //Then
        Assert.assertEquals(2, shapeCollector.shapesList.size());
    }

}
