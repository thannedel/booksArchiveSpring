package com.booksArchive.demo.dto;

import com.booksArchive.demo.model.Book;

public class BookRequest {

    private Book book;


    public BookRequest() {
    }

    public BookRequest(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookRequest{" +
                "book=" + book +
                '}';
    }
}
