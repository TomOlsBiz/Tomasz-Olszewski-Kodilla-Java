package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        //This is part of 6.1 module.
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania.");
        //This is end of 6.1 module.

        Calculator calculator = new Calculator();

        int addingTest = calculator.add(1,3);
        if(addingTest==4) {
            System.out.println("Adding is correct.");
        } else {
            System.out.println("Error in adding!");
        }

        int substractingTest = calculator.substract(7,2);
        if(substractingTest==5){
            System.out.println("Substracting is correct!");
        } else {
            System.out.println("Error in substracting.");
        }
    }
}