package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

public interface Book_Service {

	 	 Book addBook(Book book);  
	    List<Book> getBook();  
	    Book deleteBook(Long isbn);  
	    
	   
}
