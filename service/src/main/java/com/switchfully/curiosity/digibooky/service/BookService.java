package com.switchfully.curiosity.digibooky.service;

import com.switchfully.curiosity.digibooky.domain.entities.books.Book;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public interface BookService {
    //methods used by controller

     Collection<Book> getAllBooks();
     Book getBookById(UUID uuid);
     Book addOneBook(Book book);

    List<Book> getBooksByTitle(String keyword);
}
