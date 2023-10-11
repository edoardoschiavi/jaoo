package com.example.jaoo.m8.s08;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>(List.of("Asdrubale", "Mattia", "Bobo", "Tom" , "Silvio"
				, "Caio"));
		
		System.out.println("Original list: " + names);
		
		Set<String> mySet = new TreeSet<String>(names);

		System.out.println("My Tree Set is: " + mySet);
		
		//ordinati in base alla lunghezza crescente del nome
		Set<String> mySet2 = new TreeSet<String>((x,y) -> {
			if(x.length() == y.length() && !x.equals(y))
				return -1;
			return Integer.compare(x.length(), y.length());
		});
		mySet2.addAll(names);
		System.out.println("My new Tree Set is: " + mySet2);
	}
}
