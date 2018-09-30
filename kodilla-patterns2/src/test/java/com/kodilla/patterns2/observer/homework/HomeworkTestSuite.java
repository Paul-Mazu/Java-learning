package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {

    @Test
    public void testHomeworkObserver() {

        //Given
        Task task = new Task("1", "Sth");
        Participant pawel = new Participant("Pawel", new Mentor("TezPawel"));
        //When
        pawel.addTask(task);
        //Then
        Assert.assertEquals(1, pawel.getTasks().size());
    }
}
