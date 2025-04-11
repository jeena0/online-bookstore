package com.jeena.bookapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeena.bookapi.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
