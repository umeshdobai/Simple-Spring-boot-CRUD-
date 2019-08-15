package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	@Id
	public long isbn;
	public String bookname;
	public String authorname;
	public int noofcopy;
	public Long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getCopy() {
		return noofcopy;
	}
	public void setCopy(int noofcopy) {
		this.noofcopy = noofcopy;
	}
	
	
}
