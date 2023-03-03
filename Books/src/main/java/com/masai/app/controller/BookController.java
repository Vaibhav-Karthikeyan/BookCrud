package com.masai.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.entity.Book;
import com.masai.app.service.bookservice;

@RestController
@RequestMapping("/bookservice")
public class BookController {
	
	@Autowired
	bookservice books;
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return books.getBooks();
	}
	
	@GetMapping("/books/{id}")
	public Book findBook(@PathVariable(value = "id") int id) {
		return books.findBook(id);
	}
	
	@PostMapping("/books")
	public List<Book> addBook(@RequestBody Book book) {
		return books.addBook(book);
	}
	
	@PostMapping("/books/{id}")
	public List<Book> deleteBook(@PathVariable(value = "id") int id) {
		return books.deleteBook(id);
	}
	
	@PutMapping("/books/{id}")	
	public Book updateBook(@PathVariable(value = "id") int id,@RequestBody Book book) {
		return books.updateBook(id,book);
	}
	
	@PutMapping("/updateprice/{id}")	
	public Book updateBook(@PathVariable(value = "id") int id,@RequestParam int price) {
		System.out.println("hi");
		return books.updatePrice(id,price);
	}
	
}
