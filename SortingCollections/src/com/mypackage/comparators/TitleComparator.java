package com.mypackage.comparators;

import java.util.Comparator;

import com.mypackage.entity.Book;

public class TitleComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getAuthor().compareTo(o2.getAuthor());
	}

}
