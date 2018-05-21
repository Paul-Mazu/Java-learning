package com.kodilla.testing.forum;

public class ForumPost {

    String author;
    String postBody;

    public ForumPost(String postBody, String author){
        this.postBody = postBody;
        this.author = author;
    }

    public String getPostBody() {
        return postBody;
    }

    public String getAuthor() {
        return author;
    }

}
