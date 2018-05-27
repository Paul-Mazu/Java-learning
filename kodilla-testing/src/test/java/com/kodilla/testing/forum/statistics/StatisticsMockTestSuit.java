package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.doubleThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsMockTestSuit {

    private static int testsCounter = 1;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Tests began");
    }

    @Before
    public void beforeEachTest() {
        System.out.println("Test #" + testsCounter);
        testsCounter++;
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("Tests finished");
    }

    @Test //1 100 users, comments < posts(1000)
    public void testCalculateStatisticsWithMock1(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String>names1 = new ArrayList<>();
        for (int i = 0; i < 100; i++) names1.add("Imie " + i);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentCount()).thenReturn(0);
        when(statisticsMock.userNames()).thenReturn(names1);


        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double usQty = calculateStatistics.getUsersQty();
        double posQty = calculateStatistics.getPostsQty();
        double commQty = calculateStatistics.getCommentsQty();

        //Then
        Assert.assertEquals(100, usQty, 0);
        Assert.assertEquals(1000, posQty, 0);
        Assert.assertEquals(0, commQty, 0);
        Assert.assertEquals(1000/100, calculateStatistics.getAvgPostsPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAvgCommentsPerPost(), 0);
    }

    @Test //2  0 users comments < posts
    public void testCalculateStatisticsWithMock2(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String>names2 = new ArrayList<>();

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentCount()).thenReturn(0);
        when(statisticsMock.userNames()).thenReturn(names2);

        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double usQty = calculateStatistics.getUsersQty();
        double posQty = calculateStatistics.getPostsQty();
        double commQty = calculateStatistics.getCommentsQty();

        //Then
        Assert.assertEquals(0, usQty, 0);
        Assert.assertEquals(1000, posQty, 0);
        Assert.assertEquals(0, commQty, 0);
        Assert.assertEquals(0, calculateStatistics.getAvgPostsPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAvgCommentsPerPost(), 0);
    }

    @Test //3 100 users, comments > posts
    public void testCalculateStatisticsWithMock3(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String>names1 = new ArrayList<>();
        for (int i = 0; i < 100; i++) names1.add("Imie " + i);

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentCount()).thenReturn(20);
        when(statisticsMock.userNames()).thenReturn(names1);


        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double usQty = calculateStatistics.getUsersQty();
        double posQty = calculateStatistics.getPostsQty();
        double commQty = calculateStatistics.getCommentsQty();

        //Then
        Assert.assertEquals(100, usQty, 0);
        Assert.assertEquals(0, posQty, 0);
        Assert.assertEquals(20, commQty, 0);
        Assert.assertEquals(0, calculateStatistics.getAvgPostsPerUser(), 0);
        Assert.assertEquals(20/100, calculateStatistics.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAvgCommentsPerPost(), 0);
    }

    @Test //4  0 users comments > posts
    public void testCalculateStatisticsWithMock4(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String>names2 = new ArrayList<>();

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentCount()).thenReturn(20);
        when(statisticsMock.userNames()).thenReturn(names2);

        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double usQty = calculateStatistics.getUsersQty();
        double posQty = calculateStatistics.getPostsQty();
        double commQty = calculateStatistics.getCommentsQty();

        //Then
        Assert.assertEquals(0, usQty, 0);
        Assert.assertEquals(0, posQty, 0);
        Assert.assertEquals(20, commQty, 0);
        Assert.assertEquals(0, calculateStatistics.getAvgPostsPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAvgCommentsPerPost(), 0);
    }

    @Test //5 100 users, comments = 0 < posts
    public void testCalculateStatisticsWithMock5(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String>names1 = new ArrayList<>();
        for (int i = 0; i < 100; i++) names1.add("Imie " + i);

        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentCount()).thenReturn(0);
        when(statisticsMock.userNames()).thenReturn(names1);


        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double usQty = calculateStatistics.getUsersQty();
        double posQty = calculateStatistics.getPostsQty();
        double commQty = calculateStatistics.getCommentsQty();

        //Then
        Assert.assertEquals(100, usQty, 0);
        Assert.assertEquals(10, posQty, 0);
        Assert.assertEquals(0, commQty, 0);
        Assert.assertEquals((double) 10/100, calculateStatistics.getAvgPostsPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAvgCommentsPerPost(), 0);
    }

    @Test //6  0 users comments = 0 < posts
    public void testCalculateStatisticsWithMock6(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String>names2 = new ArrayList<>();

        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentCount()).thenReturn(0);
        when(statisticsMock.userNames()).thenReturn(names2);

        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double usQty = calculateStatistics.getUsersQty();
        double posQty = calculateStatistics.getPostsQty();
        double commQty = calculateStatistics.getCommentsQty();

        //Then
        Assert.assertEquals(0, usQty, 0);
        Assert.assertEquals(10, posQty, 0);
        Assert.assertEquals(0, commQty, 0);
        Assert.assertEquals(0, calculateStatistics.getAvgPostsPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAvgCommentsPerPost(), 0);
    }
}
