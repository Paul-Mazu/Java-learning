package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private String name;
    private int tasksCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Participant participant) {
        System.out.println("New Task to check done by: " + participant.getName());
        tasksCount ++;
    }

    public String getName() {
        return name;
    }

    public int getTasksCount() {
        return tasksCount;
    }
}
