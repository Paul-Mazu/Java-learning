package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Small Library");

        //When
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("The Book no: " + n, "The Author no: " + n, LocalDate.now())));

        //making shallow clone
        Library clonedLibrary = null;
        try {clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Small library clone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making deep clone
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Small library deepClone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().add(new Book("AA", "AA", LocalDate.now()));

        //Then
        Assert.assertEquals(11, library.getBooks().size());
        Assert.assertEquals(11, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
    }
}
