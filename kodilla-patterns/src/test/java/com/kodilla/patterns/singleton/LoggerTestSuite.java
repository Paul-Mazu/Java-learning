package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void LoggerTest() {
        //Given
        Logger logger = Logger.getLoggerInstance();
        //When
        String res = logger.getLastLog();
        //Then
        Assert.assertEquals("", res );
    }
}
