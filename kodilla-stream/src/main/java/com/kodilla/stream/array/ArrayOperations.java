package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers){

        IntStream.of(numbers).forEach(System.out::println);

        IntStream stream = IntStream.of(numbers);
        OptionalDouble obj = stream.average();


        return obj.getAsDouble();
    }
}
