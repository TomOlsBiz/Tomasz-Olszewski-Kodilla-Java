package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator{

    public List<Integer> exterminate(List<Integer> numbers){

        ArrayList<Integer> evenNumbersGenerated = new ArrayList<>();

        for (int number : numbers) {
            int checkedNumber = number;

            if (checkedNumber % 2 == 0) {
                evenNumbersGenerated.add(checkedNumber);
            }
        }
        return evenNumbersGenerated;
    }
}