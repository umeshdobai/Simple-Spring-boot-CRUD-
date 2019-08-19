package com.example.demo.dao;

import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Book;

@Service
public interface BookDao extends JpaRepository<Book, Long>{

	/*
	 * public Book addBook(Book book); public List<Book> getBook(); public Book
	 * deleteBook(Book book);
	 */
    
	

}
