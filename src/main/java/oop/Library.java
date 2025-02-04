package oop;

import java.util.Arrays;

public class Library {
    Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

//    @Override
//    public String toString() {
//        return "Library{" +
//                "books=" + Arrays.toString(books) +
//                '}';
//    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public void addBook(Book newBook) {
        int posittionNewBook = -1;

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                posittionNewBook = i;
                break;
            }
        }

        if (posittionNewBook != -1)
            books[posittionNewBook] = newBook;
    }

    public void removeBook(int bookPosition) {
        books[bookPosition] = null;
    }
}
