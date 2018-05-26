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
        postsQty = statistics.postsCount();
        commentsQty = statistics.commentCount();
        if (usersQty > 0) {
            avgPostsPerUser = postsQty / usersQty;
            avgCommentsPerUser = commentsQty / usersQty;
        } else {
            avgCommentsPerUser = 0;
            avgPostsPerUser = 0;
        }

        if (postsQty > 0) {
            avgCommentsPerPost = commentsQty / postsQty;
        } else {
            avgCommentsPerUser = 0;
        }
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
