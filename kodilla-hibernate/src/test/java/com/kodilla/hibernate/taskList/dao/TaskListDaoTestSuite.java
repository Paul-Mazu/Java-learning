package com.kodilla.hibernate.taskList.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.dao.TaskDao;
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
    @Autowired
    private TaskDao taskDao;

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

    @Test
    public void testNamedQueries() {
        //Given
        Task task1 = new Task("Test: Study Hibernate", 3);
        Task task2 = new Task("Test: Practice Named Queries", 6);
        Task task3 = new Task("Test: Study native queries", 7);
        Task task4 = new Task("Test: Makse some tests", 13);

        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(5), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        TaskFinancialDetails tfd3 = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd4 = new TaskFinancialDetails(new BigDecimal(15), false);

        task1.setTaskFinancialDetails(tfd1);
        task2.setTaskFinancialDetails(tfd2);
        task3.setTaskFinancialDetails(tfd3);
        task4.setTaskFinancialDetails(tfd4);

        TaskList taskList = new TaskList(LIST, "ToDo tasks");
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        taskList.getTasks().add(task3);
        taskList.getTasks().add(task4);

        task1.setTaskList(taskList);
        task2.setTaskList(taskList);
        task3.setTaskList(taskList);
        task4.setTaskList(taskList);

        taskListDao.save(taskList);
        int id = taskList.getId();

        //When
        List<Task> longTasks = taskDao.retrieveLongTasks();
        List<Task> shortTasks = taskDao.retrieveShortTasks();


        //Then
        try {
            Assert.assertEquals(1, longTasks.size());
            Assert.assertEquals(3, shortTasks.size());

        } finally {
            //CleanUp
            taskListDao.delete(id);
        }
    }

}
