package com.javaSolid.Association.Composition.Aggregation;

import java.util.ArrayList;
import java.util.List;

/*
 	Composition is a restricted form Aggregation in which two entities are highly dependent on each other.
 	It represents part-of relationship.
 	In composition, both the entities are dependent on each other.
 	When there is a composition between two entities, the composed object cannot exist without the other entity.
 */
public class Composition {

	public static void main(String[] args) {
		//Creating the Objects of Book class.
		Book b1 = new Book("Effective Jave", "Joshua Bloch");
		Book b2 = new Book("Thinking in Jave", "Bruce Eckel");
		Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");
		
		//Creating the list which contains the no. of books.
		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		Library library = new Library(books);
		List<Book> bks = library.getTotalBooksInLibrary();
		for (Book bk : bks) {

			System.out.println("Title : " + bk.title + " and " + " Author : " + bk.author);
		}
		
	}

}

//Class book
class Book{
	public String title;
	public String author;
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
}

//Library class contains list of books.
class Library{
	//reference to refer to list books.
	private List<Book> books;

	public Library(List<Book> books) {
		super();
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}
	public List<Book> getTotalBooksInLibrary() {

		return books;
	}
	
}


