package com.jeena.bookapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jeena.bookapi.entity.Book;
import com.jeena.bookapi.service.BookService;




@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/admin/book")
    public String listBooks(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books_list", books);
        return "book"; 
    }

 
   
}