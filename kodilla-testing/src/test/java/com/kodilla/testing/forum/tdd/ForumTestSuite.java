package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforAllTests(){
        System.out.println("This is the begining of tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All test are finished");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test //1
    public void testAddPost(){

        //Given
        ForumUser forumUser = new ForumUser("John", "Smith");
        //When
        forumUser.addPost("John", "Hello Hello dudes - it's my first post");
        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }
    @Test //2
    public void testAddComment(){
        //Given
        ForumUser forumUser = new ForumUser("John", "Smith");
        ForumPost thePost = new ForumPost ("Hello Hello dudes - it's my first post", "John");
        //When
        forumUser.addComment(thePost, "John", "Hello dude");
        //Then
        Assert.assertEquals(1, forumUser.getCommentsQuatity());
    }
    @Test //3
    public void testGetPost(){
        //Given
        ForumUser forumUser = new ForumUser("John", "Smith");
        ForumPost thePost = new ForumPost("Hello Dudes", "John");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(thePost, retrievedPost);
    }
    @Test //4
    public void testGetComment(){
        //Given
        ForumUser forumUser = new ForumUser("John", "Smith");
        ForumPost thePost = new ForumPost("It's my first post", "John");
        ForumComment theComment = new ForumComment(thePost, "Good to know", "Smith");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        ForumComment retrievedComment = forumUser.getComment(0);
        //Then
        Assert.assertEquals(theComment,retrievedComment);
    }
    @Test //5
    public void testRemovePostNoExisting(){
        //Given
        ForumUser forumUser = new ForumUser("John", "Simth");
        ForumPost thePost = new ForumPost("It's my first post", "Pawel");
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertFalse(result);
    }
    @Test //6
    public void testRemoveCommentNoExisting(){
        //Given
        ForumUser forumUser = new ForumUser("John", "Smith");
        ForumPost thePost = new ForumPost("Hello All", "John");
        ForumComment theComment = new ForumComment(thePost, "Hello you", "John");
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertFalse(result);
    }
    @Test //7
    public void testRemovePost(){
        //Given
        ForumUser forumUser = new ForumUser("John", "Smith");
        ForumPost thePost = new ForumPost("Hello all!", "John");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }
    @Test //8
    public void testRemoveComment(){
        //Given
        ForumUser forumUser = new ForumUser("John", "Smith");
        ForumPost thePost = new ForumPost("Hello All!", "John");
        ForumComment theComment = new ForumComment(thePost, "gut", "John");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,forumUser.getCommentsQuatity());
    }

}
