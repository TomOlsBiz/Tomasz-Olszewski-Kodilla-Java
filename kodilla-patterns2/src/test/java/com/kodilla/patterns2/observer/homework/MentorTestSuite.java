package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class MentorTestSuite {

    @Test
    public void testUpdate() {

        //Given
        Mentor mentorA = new Mentor("MentorA");
        Mentor mentorB = new Mentor("MentorB");

        Queue queueA = new Queue("Student A");
        Queue queueB = new Queue("Student B");
        Queue queueC = new Queue("Student C");

        queueA.registerObserver(mentorA);
        queueA.registerObserver(mentorB);
        queueB.registerObserver(mentorB);
        queueC.registerObserver(mentorA);

        //When
        queueA.addTask("TaskA");
        queueA.addTask("TaskB");
        queueA.addTask("TaskC");
        queueB.addTask("TaskD");
        queueB.addTask("TaskE");
        queueC.addTask("TaskF");

        //Then
        Assert.assertEquals(4, mentorA.getCount());
        Assert.assertEquals(5, mentorB.getCount());
    }

}
