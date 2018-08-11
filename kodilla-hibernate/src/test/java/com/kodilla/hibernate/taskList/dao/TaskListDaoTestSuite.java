package com.kodilla.hibernate.taskList.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.taskList.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
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
        TaskList taskList = new TaskList(LIST, DESCRIPTION);
        //When
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        List<TaskList> tasks = taskListDao.findByListName(listName);
        //Then
        Assert.assertEquals(1, tasks.size());
        //CleanUp
        int id = taskList.getId();
        taskListDao.delete(id);
    }
    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task1 = new Task(DESCRIPTION, 30);
        Task task2 = new Task(DESCRIPTION, 15);
        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(50), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(100), false);
        TaskList taskList = new TaskList(LIST, "To do Task");
        task1.setTaskFinancialDetails(tfd1);
        task2.setTaskFinancialDetails(tfd2);
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        task1.setTaskList(taskList);
        task2.setTaskList(taskList);
        //When
        taskListDao.save(taskList);
        int id = taskList.getId();
        //Then
        Assert.assertNotEquals(0, id);

    }

}
