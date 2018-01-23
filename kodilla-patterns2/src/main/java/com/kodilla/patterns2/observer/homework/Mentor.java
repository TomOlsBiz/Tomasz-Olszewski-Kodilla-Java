package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int count;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Queue queue) {
        System.out.println(name + ": New task in from: " + queue.getName() + ", total: " + queue.getTasks().size() + ")");
        count++;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
