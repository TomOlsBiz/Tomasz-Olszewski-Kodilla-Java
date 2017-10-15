package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

    private static int testNumber = 0;

    @Before
    public void before(){
        testNumber++;
        System.out.println("Start of test " + testNumber + ".");
    }

    @After
    public void after(){
        System.out.println("End of test " + testNumber + ".\n");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Tests begin...\n");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("All tests have ended.");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList(){

        //Given
        OddNumbersExterminator tester = new OddNumbersExterminator();
        ArrayList<Integer> testNumbersList = new ArrayList<>();

        //When
        ArrayList<Integer> evenNumbersGenerated = tester.exterminate(testNumbersList);

        //Then
        ArrayList<Integer> expectedNumbersList = new ArrayList<>();
        System.out.println("Expected:" + expectedNumbersList);
        System.out.println("Generated:" + evenNumbersGenerated);
        System.out.println("Number of expected numbers:" + expectedNumbersList.size());
        System.out.println("Number of generated numbers:" + evenNumbersGenerated.size());

        //alternative solution: Assert.assertTrue(evenNumbersGenerated.isEmpty());
    }


    @Test
    public void testOddNumbersExterminatorNormalList(){

        //Given
        OddNumbersExterminator tester = new OddNumbersExterminator();
        ArrayList<Integer> testNumbersList = new ArrayList<>();
        Integer[] testNumbers = {1,2,3,4,5};
        Collections.addAll(testNumbersList, testNumbers);

        //When
        ArrayList<Integer> evenNumbersGenerated = tester.exterminate(testNumbersList);

        //Then
        ArrayList<Integer> expectedNumbersList = new ArrayList<>();
        Integer[] expectedNumbers = {2,4};
        Collections.addAll(expectedNumbersList, expectedNumbers );
        Assert.assertEquals(expectedNumbersList, evenNumbersGenerated);
        System.out.println("Expected:" + expectedNumbersList);
        System.out.println("Generated:" + evenNumbersGenerated);
        System.out.println("Number of expected numbers:" + expectedNumbersList.size());
        System.out.println("Number of generated numbers:" + evenNumbersGenerated.size());
    }
}