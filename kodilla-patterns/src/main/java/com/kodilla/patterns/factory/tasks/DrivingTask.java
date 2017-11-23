package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class DrivingTask implements Task{
    String taskName;
    String where;
    String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

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
