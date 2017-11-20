package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("Millenials");
        User yGeneration = new YGeneration("YGeneration");
        User zGeneration = new ZGeneration("ZGeneration");

        //When
        String millenialsShare = millenials.sharePost();
        String yGenerationShare = yGeneration.sharePost();
        String zGenerationShare = zGeneration.sharePost();
        System.out.println(millenialsShare);
        System.out.println(yGenerationShare);
        System.out.println(zGenerationShare);

        //Then
        Assert.assertEquals("Facebook", millenialsShare);
        Assert.assertEquals("Twitter", yGenerationShare);
        Assert.assertEquals("Snapchat", zGenerationShare);
    }

    @Test
    public void testIndividualSharingStragegy() {
        //Given
        User millenials = new Millenials("Millenials");

        //When
        String millenialsShare = millenials.sharePost();
        System.out.println("Default for " + millenials.getUsername() + " is " + millenialsShare);
        millenials.setSocialMedia(new TwitterPublisher());
        millenialsShare = millenials.sharePost();
        System.out.println("New for " + millenials.getUsername() + " is " + millenialsShare);

        //Then
        Assert.assertEquals("Twitter", millenialsShare);
    }
}