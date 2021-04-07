package com.homework.sorting;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class Commodity {
	
	static void menu() {
		
		System.out.println("1 додати товар");
		System.out.println("2 видалити товар");
		System.out.println("3 вийти з програми");
	}

	public static void main(String[] args) {
		
		Set<Phone> lhs = new LinkedHashSet<>();
		lhs.add(new Phone("Areo", 23 , 56, 20));
		lhs.add(new Phone("Were", 33 , 46, 31));
		lhs.add(new Phone("reo", 43 , 49, 25));
		
		Scanner scaner = new Scanner (System.in);
		
		for(Phone p : lhs) {
			System.out.println(p);
			}
		
		while(true) {
			menu();
			
			switch(scaner.next()) {
			
			case"1":{
				System.out.println("Додати товар");
				scaner = new Scanner (System.in);
				System.out.println("Name :" );
				String name = scaner.next();
				System.out.println("Lenght : ");
				int lenght = scaner.nextInt();
				System.out.println("Weight :");
				int weight = scaner.nextInt();
				System.out.println("Wight : ");
				int wight = scaner.nextInt();
				
				lhs.add(new Phone(name, lenght,weight,wight));
				
				System.out.println(lhs);
				break;	
			}
			case"2":{
				System.out.println(" товар");
				scaner = new Scanner (System.in);
				System.out.println("Напишіть назву товару ");
				String name = scaner.next();
				Iterator<Phone> iterator = lhs.iterator();
				while(iterator.hasNext()) {
					Phone ph = iterator.next();
					if(ph.getName().equalsIgnoreCase(name)) {
						iterator.remove();
						System.out.println(lhs.toString());
						}
					}
				break;	
			}
			
			case"3" : {
				System.exit(3);
				}
				break;
			}
			
			}
		}

	}


