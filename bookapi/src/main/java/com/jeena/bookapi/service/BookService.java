package com.jeena.bookapi.service;

import java.util.List;

import com.jeena.bookapi.entity.Book;

public interface BookService {
	
	
    public List<Book> getAllBooks();
    public Book getBookById(Long id);
    public Book saveBook(Book book);
    public void deleteBook(Long id);
}