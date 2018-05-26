package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {

    // lists books having title beginning with titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

}
