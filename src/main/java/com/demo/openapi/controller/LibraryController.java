package com.demo.openapi.controller;

import com.demo.openapi.api.LibraryApi;
import com.demo.openapi.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController implements LibraryApi {
    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary() {
        List<Book> books = new ArrayList<>();

        Book book = new Book();
        book.setName("Harry Potter");
        book.setBookAuthor("JK Rowling");

        Book book1 = new Book();
        book1.setName("Atomic Habit");
        book1.setBookAuthor("Alexander");

        books.add(book);
        books.add(book1);


        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
