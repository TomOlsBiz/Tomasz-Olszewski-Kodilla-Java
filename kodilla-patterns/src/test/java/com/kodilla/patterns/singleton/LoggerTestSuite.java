package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDateTime;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog(){
        //Given
        Logger.getInstance().log("log test");
        //When
        String log = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("log test", log);
    }
}
