package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task executor(final String taskClass) {
        switch(taskClass) {
            case SHOPPING:
                return new ShoppingTask("Do shopping", "banana", 5.0);
            case PAINTING:
                return new PaintingTask("Paint like an artist", "white", "bathroom");
            case DRIVING:
                return new DrivingTask("Drive carefully", "home", "your own car");
            default:
                return null;
        }
    }
}