package com.kodilla.testing.shape;
import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests have finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter + ".");
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test #" + testCounter + " has ended.");
    }

    @Test
    public void testAddFigureCircle() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Circle circle = new Circle(15);
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(1, shapeCollector.shapeList.size());
        Assert.assertEquals("circle", shapeCollector.getFigure(0).getShapeName());
        Assert.assertEquals(Math.PI*Math.pow(15,2), shapeCollector.getFigure(0).getField(),0.01);
    }

    @Test
    public void testAddFigureTriangle() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Triangle triangle = new Triangle(10,4);
        shapeCollector.addFigure(triangle);

        //Then
        Assert.assertEquals(1, shapeCollector.shapeList.size());
        Assert.assertEquals("triangle", shapeCollector.getFigure(0).getShapeName());
        Assert.assertEquals(0.5*10*4, shapeCollector.getFigure(0).getField(),0.01);
    }

    @Test
    public void testAddFigureSquare() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Square square = new Square(7);
        shapeCollector.addFigure(square);

        //Then
        Assert.assertEquals(1, shapeCollector.shapeList.size());
        Assert.assertEquals("square", shapeCollector.getFigure(0).getShapeName());
        Assert.assertEquals(Math.pow(7,2), shapeCollector.getFigure(0).getField(),0.01);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Circle circle = new Circle(12);
        Square square = new Square(8);

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        ArrayList<Shape> expectedShapes = new ArrayList<>();
        expectedShapes.add(circle);
        expectedShapes.add(square);

        //Then
        Assert.assertEquals(expectedShapes, shapeCollector.shapeList);

    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(7,3);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.removeFigure(circle);

        //Then
        Assert.assertEquals(1, shapeCollector.shapeList.size());
    }

    @Test
    public void testTryToRemoveFigureNotExistingInCollection() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Circle circle = new Circle(5);
        boolean actionResult = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertFalse(actionResult);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Square square = new Square(8);
        Circle circle = new Circle(20);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals("circle", shapeCollector.shapeList.get(1).getShapeName());
    }
}