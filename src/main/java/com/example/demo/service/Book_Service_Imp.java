package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.BookDao;
import com.example.demo.model.Book;

@Service  
@Transactional  
public class Book_Service_Imp implements Book_Service{

	
	
	@Autowired  
    private BookDao dao;  
      
    @Override  
    public Book addBook(Book book) {  
        return dao.save(book);  
    }  
  
    @Override  
    public List<Book> getBook() {  
        List<Book> book=new ArrayList<Book>(); 
        Iterator<Book>iterator=dao.findAll().iterator();
        while(iterator.hasNext()) {
        	book.add(iterator.next());
        }
        return book;
    }  
  
    @Override  
    public Book deleteBook(Long isbn) { 
    	Book book=dao.getOne((long) isbn);
    	if(book!=null) {
    		dao.delete(book);}
    	return book;  
    }  
  
    
}
