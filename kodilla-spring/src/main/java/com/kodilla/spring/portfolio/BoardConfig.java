package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("list1")
    TaskList toDo;

    @Autowired
    @Qualifier("list2")
    TaskList inProgress;

    @Autowired
    @Qualifier("list3")
    TaskList done;


    @Bean
    public Board board() {
        return new Board(toDo, inProgress, done);
    }

    @Bean(name = "list1")
    @Scope("prototype")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean(name = "list2")
    @Scope("prototype")
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean(name = "list3")
    @Scope("prototype")
    public TaskList doneList() {
        return new TaskList();
    }
}
