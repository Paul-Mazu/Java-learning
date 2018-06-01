package com.kodilla.stream;

        import com.kodilla.stream.beautifier.PoemBeautifier;
        import com.kodilla.stream.lambda.ExpressionExecutor;
        import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAtoB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subAFromB);
        System.out.println();

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text", (anyString) -> "!!! " + anyString + " !!!");
        poemBeautifier.beautify("Text", (anyString) -> anyString.toUpperCase());
        poemBeautifier.beautify("Text", (anyString) -> anyString.toLowerCase());



    }
}