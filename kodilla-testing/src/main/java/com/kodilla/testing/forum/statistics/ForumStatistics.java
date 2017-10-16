package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int numberOfUsers;
    private int numberOfComments;
    private int numberOfPosts;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    int getNumberOfUsers() {
        return numberOfUsers;
    }

    int getNumberOfComments() {
        return numberOfComments;
    }

    int getNumberOfPosts() {
        return numberOfPosts;
    }

    double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }


    void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfComments = statistics.commentsCount();
        numberOfPosts = statistics.postsCount();

        if(numberOfUsers > 0) {
            averagePostsPerUser = (double) numberOfPosts / numberOfUsers;
            averageCommentsPerUser = (double) numberOfComments / numberOfUsers;
        } else {
            numberOfPosts = 0;
            numberOfComments = 0;
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
            averageCommentsPerPost = 0;
        }

        if(numberOfPosts >0) {
            averageCommentsPerPost = (double) numberOfComments / numberOfPosts;
        } else {
            averageCommentsPerPost = 0;
            averageCommentsPerUser = 0;
            numberOfComments = 0;
        }
    }


    void showStatistics(){
        System.out.println("nuumber of users:" + numberOfUsers + ", number of posts:" + numberOfPosts + ", number of comments:" + numberOfComments);
        System.out.println("average posts per user:" + averagePostsPerUser + ", average comments per user:" + averageCommentsPerUser + ", average comments per post:" + averageCommentsPerPost);
    }
}
