package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.doubleThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsMockTestSuit {

    @Test
    public void testCalculateStatisticsWithMock(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String>names = new ArrayList<>();
        for (int i = 0; i < 100; i++) names.add("Imie " + i);

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentCount()).thenReturn(4);
        when(statisticsMock.userNames()).thenReturn(names);

        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        calculateStatistics.showStatistics();

    }
}
