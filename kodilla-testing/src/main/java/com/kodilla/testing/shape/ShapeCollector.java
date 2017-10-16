package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapeList = new ArrayList<>();


    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean actionResult = false;
        if(shapeList.contains(shape)) {
            shapeList.remove(shape);
            actionResult = true;
        }
        return actionResult;
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if(n >=0 && n < shapeList.size()){
            shape = shapeList.get(n);
        }
        return shape;
    }

    public ArrayList<Shape> showFigures(){
        return shapeList;
    }
}