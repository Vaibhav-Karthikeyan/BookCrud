package com.masai.app.entity;

import java.util.Objects;

public class Book {
	private int id;
	private String name,author,publication,category,pages;
	private int price;
	private String author_no;
	
	public Book() {
		
	}

	public Book(int id, String name, String author, String publication, String category, String pages, int price,
			String author_no) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.category = category;
		this.pages = pages;
		this.price = price;
		this.author_no = author_no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor_no() {
		return author_no;
	}

	public void setAuthor_no(String author_no) {
		this.author_no = author_no;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publication=" + publication
				+ ", category=" + category + ", pages=" + pages + ", price=" + price + ", author_no=" + author_no + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, author_no, category, id, name, pages, price, publication);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(author_no, other.author_no)
				&& Objects.equals(category, other.category) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(pages, other.pages) && price == other.price
				&& Objects.equals(publication, other.publication);
	}
	
	
}
