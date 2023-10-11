package com.example.jaoo.m8.s08;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>(List.of("Mattia", "Bobo", "Tom" , "Silvio"));
		
		System.out.println("Original list: " + names);
		
		Set<String> mySet = new TreeSet<String>(names);

		System.out.println("My Tree Set is: " + mySet);
	}
}
