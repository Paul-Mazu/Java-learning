package com.kodilla.spring.Library;

import com.kodilla.spring.library.Library;
import com.kodilla.spring.library.LibraryConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryTestSuit {

    @Test
    public void testLoadFromDb() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //When
        library.loadFrom();
        //Then
        //Do nothing
    }

    @Test
    public void testSaveToDb() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //When
        library.saveDoDb();
        //Then
        //Do nothing
    }
    @Test
    public void testContext() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //When & Then
        System.out.println("====Beans list: ====");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
    }
}
