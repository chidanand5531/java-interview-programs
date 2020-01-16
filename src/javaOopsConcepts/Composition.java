package javaOopsConcepts;

import java.util.ArrayList;
import java.util.List;

public class Composition {

	public static void main(String[] args) {
		
	    Book bookObj1 = new Book("Java:A Beginner's Guide","Herbert Schildt");
	    Book bookObj2 = new Book("Core and Advanced Java", " Dreamtech Press");
	    Book bookObj3 = new Book("Head First Java", "Kathy Sierra");
	    
	    List<Book> books = new ArrayList<Book>();
	    books.add(bookObj1);
	    books.add(bookObj2);
	    books.add(bookObj3);
	    Library library = new Library(books);
	    List<Book> bks = library.getTotalBooksInLibrary();
	    for(Book bk : bks){
	      System.out.println("Title : " + bk.BookTitle + " and "
	          +" Author : " + bk.BookAuthor);
	    }

	}

}
