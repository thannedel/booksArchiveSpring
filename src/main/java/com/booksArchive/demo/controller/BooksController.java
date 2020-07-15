package com.booksArchive.demo.controller;

import com.booksArchive.demo.dto.BookRequest;
import com.booksArchive.demo.model.Book;
import com.booksArchive.demo.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BooksController {

    @Autowired
    private BooksRepository booksRepository;

    @PostMapping("/postBooks")
    public Book saveBooks(@RequestBody BookRequest request){
        return booksRepository.save(request.getBook());
    }

    @GetMapping("/getBooks")
    public Map<String, Object> findAllBooks(){
        Map<String, Object> booksMap = new LinkedHashMap<>();
        booksMap.put("books",getBooks());
        return booksMap;
    }

    private List<Book> getBooks(){
        return booksRepository.findAll();
    }
}
