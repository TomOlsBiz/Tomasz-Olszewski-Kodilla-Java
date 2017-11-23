package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class PaintingTask implements Task {

    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Task approached: " + getTaskName());
        if(isTaskExecuted()) {
            System.out.println("Completed.");
        } else {
            System.out.println("Not completed.");
        }
    }

    @Override
    public boolean isTaskExecuted() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
