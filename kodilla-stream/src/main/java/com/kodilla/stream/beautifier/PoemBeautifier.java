package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String anyString, PoemDecorator poemDecorator) {
        String theString = poemDecorator.decorate(anyString);
        System.out.println(theString);


    }

}
