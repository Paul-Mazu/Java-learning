package com.kodilla.patterns.builder.checkers;

import org.junit.Assert;
import org.junit.Test;

public class CheckersTestSuite {
    @Test
    public void testCheckersBuilder() {
        //Given
        Checkers checkers = new Checkers.CheckersBuilder()
                .PlayerOne("John")
                .PlayerTwo("Jim")
                .Figure(FigureFactory.PAWN, Figure.WHITE, 0, 3)
                .Figure(FigureFactory.QUEEN, Figure.BLACK, 9, 7)
                .build();
        System.out.println(checkers.getBoard());
        //When
        Figure figureOne = checkers.getBoard().getFigure(0, 3);
        //Then
        Assert.assertEquals(Figure.WHITE, figureOne.getColor());
    }
}
