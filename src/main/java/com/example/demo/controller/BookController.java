package com.example.demo.controller;

import com.example.demo.controller.*;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BookDao;
import com.example.demo.model.Book;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookDao dao;
	
	@GetMapping("/get")
	public List<Book> getBook(){
		
		System.out.println("getBook() called");
		return  (List<Book>) dao.findAll();
		
	}
	
	
	@PostMapping("/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public String addUser(@RequestBody Book book) {

		System.out.println("inside post");
		System.out.println(book.getIsbn() + " " + book.getBookname() + " " + book.getAuthorname() + " "
				+ book.getCopy());

		dao.save(book);
		return "values inserted";

	}
	
	@DeleteMapping("/del/{isbn}")
	@CrossOrigin(origins = "http://localhost:4200")
	public boolean deleteBook(@PathVariable Long isbn) {
		dao.deleteById(isbn);
		return true;
	}
	
	@PutMapping("/update")
	public Book updateUser(@PathVariable("isbn") int isbn,@RequestBody Book book) {
		book.setIsbn(isbn);
		return dao.save(book);
	}
	@GetMapping("/get/{isbn}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Optional<Book> getUser(@PathVariable("isbn") Long isbn) {
		return dao.findById(isbn);
	}
	
}
