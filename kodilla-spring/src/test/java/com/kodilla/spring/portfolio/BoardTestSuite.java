package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("modul 11");
        board.getInProgressList().getTasks().add("modul 10");
        board.getDoneList().getTasks().add("modul 9");

        //Then
        Assert.assertEquals("modul 9", board.getDoneList().getTasks().get(0));
        Assert.assertEquals("modul 10", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("modul 11", board.getToDoList().getTasks().get(0));


    }
}
