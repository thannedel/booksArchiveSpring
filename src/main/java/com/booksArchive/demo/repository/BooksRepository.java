package com.booksArchive.demo.repository;

import com.booksArchive.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, Integer> {
}
