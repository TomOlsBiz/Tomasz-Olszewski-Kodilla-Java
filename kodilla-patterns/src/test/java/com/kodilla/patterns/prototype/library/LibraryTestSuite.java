package com.kodilla.patterns.prototype.library;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Original");
        Book book1 = new Book("title1", "author1", LocalDate.of(2017,01,01));
        Book book2 = new Book("title2", "author2", LocalDate.of(2017,02,01));

        library.getBooks().add(book1);
        library.getBooks().add(book2);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.libraryShallowCopy();
            shallowClonedLibrary.setName("Shallow");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.libraryDeepCopy();
            deepClonedLibrary.setName("Deep");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        System.out.println("Original library before removal of a book");
        System.out.println(library);
        library.getBooks().remove(book1);

        //Then
        System.out.println("Original library after removal of a book");
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(1, library.getBooks().size());
        Assert.assertEquals(1, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(2, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), shallowClonedLibrary.getBooks());
        Assert.assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());
        Assert.assertEquals("Shallow", shallowClonedLibrary.getName());
        Assert.assertEquals("Deep", deepClonedLibrary.getName());
    }
}
