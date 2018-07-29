package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuit {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resAdd = calculator.add(10,10);
        double resSub = calculator.sub(15, 10);
        double resMul = calculator.mul(2, 2);
        double resDiv = calculator.div(10, 5);
        //Then
        Assert.assertEquals(resAdd, 20, 0.001);
        Assert.assertEquals(resSub, 5, 0.001);
        Assert.assertEquals(resMul, 4, 0.001);
        Assert.assertEquals(resDiv, 2, 0.001);
    }
}
