package com.kodilla.hibernate.taskList.dao;

import com.kodilla.hibernate.taskList.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Description of the task";
    private static final String LIST = "The List";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(DESCRIPTION, LIST);
        //When
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        List<TaskList> tasks = taskListDao.findByListName(listName);
        //Then
        Assert.assertEquals(1, tasks.size());
        //CleanUp
        int id = tasks.get(0).getId();
        taskListDao.delete(id);


    }
}
