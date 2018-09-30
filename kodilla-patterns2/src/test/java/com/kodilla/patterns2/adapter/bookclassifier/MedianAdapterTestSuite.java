package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author", "Title", 1989, "Signature"));
        bookSet.add(new Book("Author1", "Title1", 2011, "Signature1"));
        bookSet.add(new Book("Author2", "Title2", 1990, "Signature2"));
        bookSet.add(new Book("Author3", "Title3", 2018, "Signature3"));
        bookSet.add(new Book("Author4", "Title4", 2001, "Signature4"));
        //When
        int result = medianAdapter.publicationYearMedian(bookSet);
        //Then
        Assert.assertEquals(2001, result);
    }
}
