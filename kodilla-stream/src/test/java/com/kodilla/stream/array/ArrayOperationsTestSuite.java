package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int testNumbersTable[] = {5, 10, 15, 20};
        //When
        double calculatedAverage = ArrayOperations.getAverage(testNumbersTable);
        //Then
        Assert.assertEquals(12.5, calculatedAverage, 0.01);
    }
}
