package com.homework.set;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<Book> hs = new TreeSet<>(new BookComparable());
		hs.add(new Book("Wood",247, 15, 75));
		hs.add(new Book("The Sun",301, 18, 90));
		hs.add(new Book("Advice",190, 17, 65));
		hs.add(new Book("Tom from Village",295, 19, 80));
		hs.add(new Book("Family",282, 20, 71));
		
		System.out.println();
		
		System.out.println(hs.toString());
		
		System.out.println("Comperator");
		
		for(Book book : hs) {
			System.out.println(book);
		}

		System.out.println();
		
		
		
		
	}

}
