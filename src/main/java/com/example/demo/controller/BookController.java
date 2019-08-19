//THis is book Controller 

package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.Book_Service;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private Book_Service bookservice;
	
	@GetMapping("/get")
	public List<Book> getBook(){
		
		System.out.println("getBook() called");
		return  (List<Book>) bookservice.getBook();
		
	}
	
	
	@PostMapping("/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public String addBook(@RequestBody Book book) {

		System.out.println("inside post");
		System.out.println(book.getIsbn() + " " + book.getBookname() + " " + book.getAuthorname() + " "
				+ book.getCopy());

		bookservice.addBook(book);
		return "values inserted";

	}
	
	@DeleteMapping("/del/{isbn}")
	@CrossOrigin(origins = "http://localhost:4200")
	public boolean deleteBook(@PathVariable Long isbn) {
		bookservice.deleteBook(isbn);
		return true;
	}
	
//	@PutMapping("/update")
//	public Book updateUser(@PathVariable("isbn") int isbn,@RequestBody Book book) {
//		book.setIsbn(isbn);
//		return dao.save(book);
//	}
//	@GetMapping("/get/{isbn}")
//	@CrossOrigin(origins = "http://localhost:4200")
//	public Optional<Book> getUser(@PathVariable("isbn") Long isbn) {
//		return bookservice.findById(isbn);
//	}
	
}
