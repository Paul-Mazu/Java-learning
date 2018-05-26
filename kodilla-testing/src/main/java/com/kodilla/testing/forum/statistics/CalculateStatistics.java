package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private double usersQty;
    private double postsQty;
    private double commentsQty;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public double getUsersQty() {
        return usersQty;
    }

    public double getPostsQty() {
        return postsQty;
    }

    public double getCommentsQty() {
        return commentsQty;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        usersQty = statistics.userNames().size();
        if (usersQty <= 0) return;
        postsQty = statistics.postsCount();
        if (postsQty <= 0) return;
        commentsQty = statistics.commentCount();
        avgPostsPerUser = postsQty / usersQty;
        avgCommentsPerUser = commentsQty / usersQty;
        avgCommentsPerPost = commentsQty / postsQty;
    }

    public void showStatistics(){
        System.out.println("Users Qty: " + usersQty);
        System.out.println("Posts Qty: " + postsQty);
        System.out.println("Comments Qty: " + commentsQty);
        System.out.println("Posts per User: " + avgPostsPerUser);
        System.out.println("Comments per user: " + avgCommentsPerUser);
        System.out.println("Comments per Post: " + avgCommentsPerPost);
    }



}
