package com.kodilla.stream.book;

public final class Book {

    private final String signature;
    private final String author;
    private final String title;
    private final int yearOfPublication;

    public Book(final String signature, final String author, final String title, final int yearOfPublication) {
        this.signature = signature;
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getSignature() {
        return signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        return signature + " " + author + " " + title + " " + yearOfPublication;
    }
}
