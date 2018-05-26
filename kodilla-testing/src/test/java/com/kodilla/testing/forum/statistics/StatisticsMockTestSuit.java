package com.kodilla.testing.forum.statistics;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsMockTestSuit {

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Tests began");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("Tests finished");
    }

    @Test
    public void testCalculateStatisticsWithMock(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String>names1 = new ArrayList<>();
        for (int i = 0; i < 100; i++) names1.add("Imie " + i);

        List<String>names2 = new ArrayList<>();

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentCount()).thenReturn(4);
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
        Assert.assertEquals(4, commQty, 0);
    }
}
