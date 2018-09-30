package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Participant implements Observable {

    private String name;
    private List<Task> tasks;
    private Observer mentor;

    public Participant(String name, Observer mentor) {
        this.name = name;
        this.mentor = mentor;
        tasks = new ArrayList<>();
    }
    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        mentor.update(this);
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
