package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaTools = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser charles = new ForumUser("Charles Adomako");
        ForumUser benjamin = new ForumUser("Benjamin Wilson");
        javaHelpForum.registerObserver(johnSmith);
        javaTools.registerObserver(charles);
        javaHelpForum.registerObserver(benjamin);
        javaTools.registerObserver(benjamin);
        //When
        javaHelpForum.addPost("aaaaa");
        javaHelpForum.addPost("bbbbbb");
        javaTools.addPost("cccccc");
        javaTools.addPost("ddddd");
        javaTools.addPost("eeeeeee");
        //Then
        Assert.assertEquals(2, johnSmith.getUpdateCount());
        Assert.assertEquals(3, charles.getUpdateCount());
        Assert.assertEquals(5, benjamin.getUpdateCount());
    }
}
