package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class ShoppingTask implements Task {

    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
