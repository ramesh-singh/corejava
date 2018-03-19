package com.mypackage.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.mypackage.comparators.PriceComparator;
import com.mypackage.comparators.TitleComparator;
import com.mypackage.entity.Book;

public class MainApp {
	public static void main(String[] args) {
		List<String> citiesToVisit= new ArrayList<String>();
		citiesToVisit.add("Denver");
		citiesToVisit.add("Las Vegas");
		citiesToVisit.add("New York");
		citiesToVisit.add("Amerstdam");
		citiesToVisit.add("London");
		
		/*String [] ciites= {"Denver", "Las Vegas", "New York", "Amerstdam", "London"};
		List<String> cityList= Arrays.asList(ciites);
		
		System.out.println(cityList.size());
		cityList.add(3, "random");  //UnsupportedOperationException
		System.out.println(cityList);
		System.out.println(ciites);
		*/
		/*citiesToVisit.add(3, "random");
		System.out.println(citiesToVisit);*/

		System.out.println("Unsorted List.");
		System.out.println(citiesToVisit);

		System.out.println("Simple Sorting");

		System.out.println("Sorted list.");
		Collections.sort(citiesToVisit);
		System.out.println(citiesToVisit);

		System.out.println("Sorting a class with Comparable.");
		List<Book> books= new ArrayList<Book>();
		Book book1= new Book("Oliver Twist", "Charles Dickens", 25.78);
		Book book2= new Book("Half Girlfriend", "Chetan Bhagat", 0.99);
		Book book3= new Book("Harry Porter", "J.K. Rowling", 52.89);
		Book book4= new Book("The Hobbit", "J.R.R. Tolkien", 45.78);
		Book book5= new Book("1984", "George Owell", 35.68);
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		
		System.out.println("Unsorted book list.");
		System.out.println(books);
		
		System.out.println("Sorted book list using comparable based on title.");
		Collections.sort(books);
		System.out.println(books);
		
		System.out.println("Sorted book list using comparator based on author.");
		TitleComparator titleComparator= new TitleComparator();
		Collections.sort(books, titleComparator);
		System.out.println(books);
		
		System.out.println("Sorted book list using comparator based on the price.");
		PriceComparator priceComparator= new PriceComparator();
		Collections.sort(books, priceComparator);
		System.out.println(books);
	}

}
