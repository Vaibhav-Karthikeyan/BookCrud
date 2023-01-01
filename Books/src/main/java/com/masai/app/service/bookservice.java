package com.masai.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.masai.app.entity.Book;

import jakarta.annotation.PostConstruct;

@Component
public class bookservice {
	List<Book> books=new ArrayList<Book>();
	
	@PostConstruct
	public void addBooks() {
		books.add(new Book(1,"Harry Potter 1","Jk Rowling","Bloomsberry","fantasy","1000",750,"G100"));
		books.add(new Book(2,"Harry Potter 2","Jk Rowling","Bloomsberry","fantasy","500",650,"G100"));
		books.add(new Book(3,"Harry Potter 3","Jk Rowling","Bloomsberry","fantasy","700",950,"G100"));
		books.add(new Book(4,"Harry Potter 4","Jk Rowling","Bloomsberry","fantasy","900",550,"G100"));
		books.add(new Book(5,"Harry Potter 5","Jk Rowling","Bloomsberry","fantasy","1200",1000,"G100"));
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public Book findBook(int id) {
		for(Book i:books) {
			if(i.getId()==id)
				return i;
		}
		return null;
	}
	
	public List<Book> deleteBook(int id) {
		Book found=findBook(id);
		books.remove(found);
		return getBooks();
	}
	
	public List<Book> addBook(Book b){
		books.add(b);
		return getBooks();
	}
	
	public Book updateBook(int id,Book book) {
		deleteBook(id);
		book.setId(id);
		addBook(book);
		return book;
	}
	public Book updatePrice(int id,int price) {
		Book book=findBook(id);
		book.setPrice(price);
		return book;
	}
	
}
