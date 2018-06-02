package com.kodilla.stream.book;

import java.util.ArrayList;
import java.util.List;

public final class BookDirectory {

    private final List<Book> theBookList = new ArrayList<>();

    public BookDirectory(){
        theBookList.add(new Book("0001", "Dylan Murphy", "Wolf of the mountains", 2003));
        theBookList.add(new Book("0002", "Phoebe Pearson", "Slaves of dreams", 2012));
        theBookList.add(new Book("0003", "Morgan Walsh", "Obliteration of heaven", 2001));
        theBookList.add(new Book("0004", "Aimee Murphy", "Rejecting the night", 2015));
        theBookList.add(new Book("0005", "Ryan Talley", "Gangsters and kings", 2007));
        theBookList.add(new Book("0006", "Madelynn Carson", "Unity without duty", 2007));
        theBookList.add(new Book("0007", "Giancarlo Guerrero", "Enemies of eternity", 2009));
    }
    public List<Book> getList() {
        return new ArrayList<>(theBookList);
    }
}
