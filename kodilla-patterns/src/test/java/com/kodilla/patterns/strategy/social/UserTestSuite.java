package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John");
        User jack = new YGeneration("Jack");
        User jim = new ZGeneration("Jim");
        //When
        String johnShares = john.sharePost();
        System.out.println(johnShares);
        String jackShares = jack.sharePost();
        System.out.println(jackShares);
        String jimShares = jim.sharePost();
        System.out.println(jimShares);
        //Then
        Assert.assertEquals("Publishes on Facebook", johnShares);
        Assert.assertEquals("Publishes on Twitter", jackShares);
        Assert.assertEquals("Publishes on Snapchat", jimShares);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John");
        //When
        String johnShares = john.sharePost();
        System.out.println(johnShares);
        john.setSocialPublisher(new TwitterPublisher());
        johnShares = john.sharePost();
        System.out.println(johnShares);
        //Then
        Assert.assertEquals("Publishes on Twitter", johnShares);
    }
}
