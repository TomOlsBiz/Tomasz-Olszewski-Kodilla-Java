package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify (String inputText, PoemDecorator poemDecorator) {
        String outputText = poemDecorator.decorate(inputText);
        System.out.println(outputText);
    }
}
