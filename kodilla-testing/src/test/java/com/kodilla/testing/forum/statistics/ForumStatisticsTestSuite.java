package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private ForumStatistics forumStatistics;
    private Statistics statisticsMock;
    private List<String> mockUsers;
    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        forumStatistics = new ForumStatistics();
        statisticsMock = mock(Statistics.class);
        mockUsers = new ArrayList<String>();
        for (int n = 1; mockUsers.size() < 100; n++) {
            mockUsers.add("mockUser" + n++);
        }
        when(statisticsMock.usersNames()).thenReturn(mockUsers);
        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(400);
        testCounter++;
        System.out.println("Test #" + testCounter + " starts.");
    }

    @After
    public void afterEveryTest() {
        forumStatistics.showStatistics();
        System.out.println("Test #" + testCounter + " ends.\n");
    }


    @Test
    public void testCalculateAdvStatisticsFor0Posts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(0, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(0, forumStatistics.getNumberOfComments());
        Assert.assertEquals(0, forumStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerUser(), 0.01);
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsFor1000Posts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(1000, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(400, forumStatistics.getNumberOfComments());
        Assert.assertEquals(10, forumStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(4, forumStatistics.getAverageCommentsPerUser(), 0.01);
        Assert.assertEquals(0.4, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsFor0Comments() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(200, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(0, forumStatistics.getNumberOfComments());
        Assert.assertEquals(2, forumStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerUser(), 0.01);
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsFor200Posts100Comments() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(200, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(100, forumStatistics.getNumberOfComments());
        Assert.assertEquals(2, forumStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(1, forumStatistics.getAverageCommentsPerUser(), 0.01);
        Assert.assertEquals(0.5, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsFor200Posts400Comments() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(400);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(200, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(400, forumStatistics.getNumberOfComments());
        Assert.assertEquals(2, forumStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(4, forumStatistics.getAverageCommentsPerUser(), 0.01);
        Assert.assertEquals(2, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }


    @Test
    public void testCalculateAdvStatisticsFor0Users() {
        //Given
        mockUsers = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(mockUsers);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(0, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(0, forumStatistics.getNumberOfComments());
        Assert.assertEquals(0, forumStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerUser(), 0.01);
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }


    @Test
    public void testCalculateAdvStatisticsFor100Users() {
        //Given

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(200, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(400, forumStatistics.getNumberOfComments());
        Assert.assertEquals(2, forumStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(4, forumStatistics.getAverageCommentsPerUser(), 0.01);
        Assert.assertEquals(2, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

}