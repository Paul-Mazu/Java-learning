package com.kodilla.stream;

        import com.kodilla.stream.beautifier.PoemBeautifier;
        import com.kodilla.stream.book.Book;
        import com.kodilla.stream.book.BookDirectory;
        import com.kodilla.stream.forumUser.Forum;
        import com.kodilla.stream.forumUser.ForumUser;
        import com.kodilla.stream.iterate.NumbersGenerator;
        import com.kodilla.stream.lambda.ExpressionExecutor;
        import com.kodilla.stream.person.People;
        import com.kodilla.stream.reference.FunctionalCalculator;

        import java.time.LocalDate;
        import java.util.List;
        import java.util.Map;
        import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

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
        System.out.println();

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

        /*People.getList().stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0,1).equals("M"))
                .forEach(System.out::println);*/

        /*BookDirectory theBookDirectory = new BookDirectory();
        Map <String, Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/

        /*BookDirectory bookDirectory = new BookDirectory();
        String theResultStringOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);*/

        Forum forum = new Forum();
        Map<Integer, ForumUser> theForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'F')
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPostsQty() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        theForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}